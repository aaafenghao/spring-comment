package com.fh.mybatis.config;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactoryBean implements FactoryBean, InvocationHandler {

	private Class aClass;

	public MyFactoryBean(Class cla){
		this.aClass = cla;
	}


	@Override
	public Object getObject() {
		Class[] classes = new Class[] {aClass};
		Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(), classes, this);
		return object;
	}

	@Override
	public Class<?> getObjectType() {
		return aClass;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Exception{
		Method list = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
		Select select = list.getDeclaredAnnotation(Select.class);
		System.out.println(select.value());
		return null;
	}
}
