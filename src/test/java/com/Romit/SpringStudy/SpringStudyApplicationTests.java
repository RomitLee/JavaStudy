package com.Romit.SpringStudy;

import com.Romit.SpringStudy.Service.SysUserService;
import com.Romit.SpringStudy.entity.SysUser;
import com.Romit.SpringStudy.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;

import java.util.List;


class SpringStudyApplicationTests {
	@Autowired
	private  SysUser sysUser;

	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private RedisUtil redisUtil;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Test
	void redisTest() {

		SysUser sysUser =sysUserService.getById(2);
		System.out.println(sysUser);

		//boolean isSet=redisUtil.set("CaptchaCode","ngwm2");
		//System.out.println(isSet);


		String CaptchaCode=String.valueOf(redisUtil.get("CaptchaCode"));
		//JSONObject jsonObject=JSONUtil.parseObj(CaptchaCode);
		System.out.println("验证码是："+CaptchaCode);


	}

	@Test
	void redisPiplistTest() {

		List list=redisTemplate.executePipelined(new SessionCallback(){


			@Override
			public Object execute(RedisOperations operations) throws DataAccessException {
				for (int i=1;i<=100000;i++)
					operations.opsForValue().set("pipLine_"+i,"value_"+i);
				return null;
			}
		});

		System.out.println(list);




	}
	/**

	 *@描述  redis缓存的学习

	 *@参数

	 *@返回值

	 *@创建人 李锐(Romit.Lee)

	 *@创建时间 2019/12/6

	 *@修改人和其它信息

	 */
	@Test
	void redisChacheSaveTest() {



		SysUser sysUser=new SysUser();
		sysUser.setUserName("chache");
		sysUser.setUserEmail("1223@qq.com");
		sysUser.setId((long) 888);

		sysUserService.saveUser(sysUser);
		System.out.println("SysUser的缓存存储结果：");
	}


	@Test
	void redisChacheGetTest() {





		SysUser sysUser=sysUserService.getUser(888);
		System.out.println(sysUser);
	}

}
