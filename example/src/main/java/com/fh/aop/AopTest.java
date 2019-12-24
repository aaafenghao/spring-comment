package com.fh.aop;


import com.fh.aop.dao.Person;
import com.fh.config.AutoConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class AopTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		/**
		 * 在Spring容器中获取不到IndexDao,Spring容器中放的是jdk动态代理出来的新的Dao的实现
		 */
//		Person personService = (Person)context.getBean("personService");
//		personService.query();

		IndexDao bean = context.getBean(IndexDao.class);
		bean.scope();
		System.out.println("1--"+bean);
		IndexDao indexDao = context.getBean(IndexDao.class);
		indexDao.scope();
		System.out.println("2--"+indexDao);

	}
}
