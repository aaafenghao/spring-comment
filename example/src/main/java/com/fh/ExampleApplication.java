package com.fh;

import com.fh.config.AutoConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动类
 *
 */
public class ExampleApplication {

	/**
	 * IndexService和UserService的初始化过程
	 * 首先加载IndexService,从单例池中获取Bean,获取不到,创建对象,添加到正在创建的集合中
	 * 解析IndexService的依赖关系,发现依赖UserServiceBean,然后从单例池中获取,获取不到Bean,创建对象,添加到正在创建的集合中
	 * 解析UserService的依赖关系,发现依赖IndexServiceBean,然后从单例池中获取不到,从早期池中获取不到,从单例工程Bean中获取到了
	 * 然后添加到早期池中,接着执行接下来的生命周期,执行完成后添加到单例池中,
	 * 然后接着执行IndexService的生命周期,注入依赖关系
	 * 结束！！！
	 * @param args
	 */
	public static void main(String[] args) {

		//初始化Spring容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		//从容器中获取信息
	/*	IndexService indexService = context.getBean(IndexService.class);
		System.out.println(indexService);*/
//		HHService bean = context.getBean(HHService.class);
//		bean.hello();
//		HHService bean2 = context.getBean(HHService.class);
//		bean2.hello();
		/**
		 * BeanFactory和FactoryBean的区别
		 *
		 * BeanFactory:是一个Bean工厂,负责管理和生成Bean的一个工厂接口,是IOC容器的接口的底层实现
		 * FactoryBean:是一个Bean,是一个可以生产对象和装饰对象的工厂Bean,交给Spring管理后,生成的Bean 由getObject决定
		 */
		Object factoryBeanConfig = context.getBean("factoryBeanConfig");
		System.out.println(factoryBeanConfig);


	}
}
