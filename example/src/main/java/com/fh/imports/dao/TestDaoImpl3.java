package com.fh.imports.dao;

import com.fh.imports.ProxyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class TestDaoImpl3 implements  BeanPostProcessor {



	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("testDao".equals(beanName)){
			bean =  Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{TestDao.class},new ProxyInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
