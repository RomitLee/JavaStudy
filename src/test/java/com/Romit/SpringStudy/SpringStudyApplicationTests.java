package com.Romit.SpringStudy;

import com.Romit.SpringStudy.Service.SysUserService;
import com.Romit.SpringStudy.entity.SysRole;
import com.Romit.SpringStudy.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStudyApplicationTests {
	@Autowired
	private SysUserService sysUserService;
	@Test
	void contextLoads() {

		SysUser sysUser =sysUserService.getById(2);
		System.out.println(sysUser);

	}

}
