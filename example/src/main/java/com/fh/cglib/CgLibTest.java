package com.fh.cglib;

import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class CgLibTest {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AopService.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new MyMethodCallback());
		AopService aopService = (AopService) enhancer.create();
		aopService.query();

		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		String name = runtimeMXBean.getName();
		String pid = name.split("@")[0];
		System.out.println("pid : "+pid);

		//查看cglib生成的类
		//java -classpath D:\java\lib\sa-jdi.jar "sun.jvm.hotspot.HSDB"
		//可以根据同理查看Spring内部的通过cglib生成的代理类
		//sawingbg.dll如果在

		try {
			System.in.read();
		}catch (Exception e){
			e.printStackTrace();
		}


	}
}
