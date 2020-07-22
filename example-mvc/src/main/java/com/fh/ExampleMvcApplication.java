package com.fh;

import com.fh.config.AutoConfig;
import org.apache.catalina.Context;
import org.apache.catalina.Server;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class ExampleMvcApplication {

	public static void main(String[] args) throws Exception {
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		context.register(AutoConfig.class);
		context.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));

		Tomcat tomcat = new Tomcat();
		/**
		 * web项目
		 * contextPath tomcat的访问路径
		 * 项目的web目录
		 *
		 * 会调用相关的初始化实现类
		 */
//		Context context1 = tomcat.addWebapp("/", base.getAbsolutePath());

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		Context context1 = tomcat.addContext("/", base.getAbsolutePath());
		//tomcat启动的过程中会调用DispatcherServlet中的init方法
		Tomcat.addServlet(context1,"my",dispatcherServlet).setLoadOnStartup(1);
		//spring web环境
		context1.addServletMappingDecoded("/","my");
//		context1.addServletMapping("/","my");

		//tomcat8
//		tomcat.setPort(8080);
//		tomcat.start();
//		tomcat.getServer().await();


		//tomcat9
		Server server = tomcat.getServer();
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(8080);
		connector.setThrowOnFailure(true);
		tomcat.getService().addConnector(connector);
		tomcat.setConnector(connector);
		tomcat.start();
		server.await();
	}



}
