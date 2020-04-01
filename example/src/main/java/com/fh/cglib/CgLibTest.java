package com.fh.cglib;

import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;

public class CgLibTest {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AopService.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new MyMethodCallback());
		AopService aopService = (AopService) enhancer.create();
		aopService.query();
	}
}
