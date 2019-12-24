package com.fh.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class AsyncService {

	@Async
	public void asyncTask(){
		try {
			TimeUnit.SECONDS.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("async");
	}
}
