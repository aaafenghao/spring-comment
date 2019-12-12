package com.fh.aop;


import com.fh.config.AutoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		Dao bean = context.getBean(Dao.class);
		System.out.println(bean.query());
	}
}
