package com.fh.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class IndexDao implements Dao {
	@Override
	public String query() {
		return "query";
	}

	@Override
	public void scope(){
		System.out.println("scope");
	}

}
