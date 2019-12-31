package com.fh.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component(value = "factoryBeanConfig")
public class FactoryBeanConfig implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new BeanFactoryConfig();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanFactoryConfig.class;
	}
}
