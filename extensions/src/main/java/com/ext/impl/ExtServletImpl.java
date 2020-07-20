package com.ext.impl;

import com.ext.ExtServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ExtServletImpl implements ExtServlet {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("------------------我就看看能不能打印");
	}
}
