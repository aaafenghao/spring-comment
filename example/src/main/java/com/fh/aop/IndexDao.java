package com.fh.aop;

import org.springframework.stereotype.Component;

@Component
public class IndexDao implements Dao {
	@Override
	public String query() {
		return "query";
	}
}
