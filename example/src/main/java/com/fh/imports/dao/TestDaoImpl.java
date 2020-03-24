package com.fh.imports.dao;

import org.springframework.stereotype.Component;

@Component(value = "testDao")
public class TestDaoImpl implements TestDao {
	@Override
	public void test() {
		System.out.println("TestDaoImpl");
	}
}
