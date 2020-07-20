package com.fh.config;

import com.fh.aop.service.PersonService;
import com.fh.service.IndexService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(value = {"com.fh"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PersonService.class})})
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
