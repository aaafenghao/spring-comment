package com.fh.config;

import com.fh.service.IndexService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan("com.fh")
@Configuration
@EnableAsync
//@Import(MyImportSelector.class)
public class AutoConfig {

//	@Bean(initMethod = "initMethod")
	public IndexService getIndexService(){
		IndexService indexService =  new IndexService();
		return indexService;
	}
}
