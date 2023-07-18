package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//springboot configuration,component scan,자동세팅 등을 함-+-
//==+@SpringBootConfiguration // 스프링 부트의 설정
//+ @EnableAutoConfiguration // 자동설정. 설정값이 없으며 기본값으로 작동
//+ @ComponentScan // 경로를 지정하지 않으면 클래스 있는 패키지가 루트 경로로 설정
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
//내장형톰캣이있기때문에jar로패키징하면됨(외부서버쓴다면얘기는달라짐)

