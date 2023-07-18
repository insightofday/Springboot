package com.hehe.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//mapper패키지 읽어들이기
//database-context.xml의 	<mybatis-spring:scan base-package="com.cutie.app.**.mapper" />역할을 함
@SpringBootApplication
@MapperScan(basePackages = "com.hehe.app.**.mapper")
public class Ex05Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex05Application.class, args);
	}

}
