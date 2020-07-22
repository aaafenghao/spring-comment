package com.fh.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) {
		//Servlet3.0规定
		//会调用ClassPath下的META-INF/services/javax.servlet.ServletContainerInitializer文件中的内容

		//初始化SpringWeb和Spring环境
		//tomcat主动调用
		System.out.println("Web 项目调用初始化");
	}
}
