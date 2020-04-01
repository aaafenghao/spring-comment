package com.fh.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AopConfig {

	@Bean
	public AopService getAopService(){
		getAopService1();
		return new AopService();
	}

	@Bean
	public AopService1 getAopService1(){
		return new AopService1();
	}
}
