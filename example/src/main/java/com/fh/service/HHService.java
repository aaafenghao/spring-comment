package com.fh.service;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public  class HHService implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public void hello(){
		OrderService orderService = getOrderService();
		System.out.println(orderService);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	private OrderService getOrderService(){
		return applicationContext.getBean(OrderService.class);
	}


/*	@Lookup
	public abstract OrderService getOrderService();*/
}
