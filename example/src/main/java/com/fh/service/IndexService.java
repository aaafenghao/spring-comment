package com.fh.service;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IndexService implements InitializingBean {

	@Autowired
	private UserService userService;

	public IndexService(){
		System.out.println("构造函数执行");
	}

	@PostConstruct
	public void init(){
		System.out.println("init--postConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init afterPropertiesSet");
	}

	public void initMethod(){
		System.out.println("initMethod");
	}


}
