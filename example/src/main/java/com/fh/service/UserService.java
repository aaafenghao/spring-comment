package com.fh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService(){
		System.out.println("user service init");
//		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//		for (StackTraceElement stackTraceElement : stackTrace) {
//			System.out.println(stackTraceElement.toString());
//		}
	}
}
