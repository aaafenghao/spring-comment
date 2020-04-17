package com.fh.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCL {

	public static void main(String[] args) {
		//org.apache.logging.slf4j.SLF4JProvider
		Log log = LogFactory.getLog(JCL.class);
		log.info("jcl");
	}
}
