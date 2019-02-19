package com.mingyang.it.springbootmybatisannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//开启缓存
@EnableCaching
public class SpringbootMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisAnnotationApplication.class, args);
	}

}
