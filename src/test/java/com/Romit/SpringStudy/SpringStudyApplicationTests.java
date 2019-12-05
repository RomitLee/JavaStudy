package com.Romit.SpringStudy;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.Romit.SpringStudy.Service.SysUserService;
import com.Romit.SpringStudy.entity.SysRole;
import com.Romit.SpringStudy.entity.SysUser;
import com.Romit.SpringStudy.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStudyApplicationTests {
	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private RedisUtil redisUtil;
	@Test
	void contextLoads() {

		SysUser sysUser =sysUserService.getById(2);
		System.out.println(sysUser);

		//boolean isSet=redisUtil.set("CaptchaCode","ngwm2");
		//System.out.println(isSet);


		String CaptchaCode=String.valueOf(redisUtil.get("CaptchaCode"));
		//JSONObject jsonObject=JSONUtil.parseObj(CaptchaCode);
		System.out.println("验证码是："+CaptchaCode);


	}

}
