package com.fh;

import com.fh.config.AppConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLogApplication {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.start();

		Log log = LogFactory.getLog(BLogApplication.class);
		log.info("jcl");
	}
}
