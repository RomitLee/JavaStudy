package com.Romit;

import com.Romit.IOC.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
//@ConfigurationPropertiesScan("")
//basePackages = {"com.Romit.SpringStudy.mapper"}
@MapperScan("com.Romit.SpringStudy.mapper")

@EnableCaching
public class SpringStudyApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringStudyApplication.class, args);
//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringStudyApplication.class);
//		ac.getBean("UserService");
//		ac.getBean(UserService.class).getService();
	}




//	@Bean
//	public MapperFactoryBean<PersonDAO> initPersonDAO(){
//		MapperFactoryBean<PersonDAO> bean=new MapperFactoryBean<>();
//		bean.setMapperInterface(PersonDAO.class);
//		bean.setSqlSessionFactory(sqlSessionFactory);
//		return bean;

//	}

//	@Bean(name = "myAspect")
//	public MyAspect initMyAspect(){
//		return new MyAspect();
//
//	}

}
