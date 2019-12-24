package com.fh.aop.dao;

public class DefaultImpl implements Person {
	@Override
	public void query() {
		System.out.println("default");
	}
}
