package com.fh.async;

import com.fh.config.AutoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

public class AsyncTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		AsyncService bean = context.getBean(AsyncService.class);
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bean.asyncTask();
		System.out.println("调用完成异步方法");

	}


}
