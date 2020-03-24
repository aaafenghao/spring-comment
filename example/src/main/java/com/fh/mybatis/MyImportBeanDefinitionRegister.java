package com.fh.mybatis;

import com.fh.mybatis.config.LubanScan;
import com.fh.mybatis.config.MyFactoryBean;
import com.fh.mybatis.dao.CardDao;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		MergedAnnotations annotations = importingClassMetadata.getAnnotations();
		MergedAnnotation<LubanScan> lubanScanMergedAnnotation = annotations.get(LubanScan.class);
		String value = lubanScanMergedAnnotation.getString("value");
		System.out.println("----------");
		System.out.println(value);
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
		GenericBeanDefinition beanDefinition =(GenericBeanDefinition) builder.getBeanDefinition();
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.fh.mybatis.dao.CardDao");
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("cardDao",beanDefinition);
	}
}
