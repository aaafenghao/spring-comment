package com.fh.aop;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class HelloService {

	@Async
	public void asyncTest(){
		System.out.println("start task");
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("end task");
		}

	}
}
