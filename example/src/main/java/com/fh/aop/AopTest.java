package com.fh.aop;


import com.fh.config.AutoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AopTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		/**
		 * 在Spring容器中获取不到IndexDao,Spring容器中放的是jdk动态代理出来的新的Dao的实现
		 */
		Dao bean = context.getBean(IndexDao.class);
		System.out.println(bean.query());
//		HelloService bean = context.getBean(HelloService.class);
//		bean.asyncTest();
//		System.out.println(Thread.currentThread().isDaemon());


	}
}
