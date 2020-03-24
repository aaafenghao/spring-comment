package com.fh.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

	Object target;

	public ProxyInvocationHandler(Object object){
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理类执行!!!");
		return method.invoke(target,args);
	}
}
