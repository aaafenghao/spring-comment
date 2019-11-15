package com.fh;

import com.fh.config.AutoConfig;
import com.fh.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		IndexService indexService = context.getBean(IndexService.class);
		System.out.println(indexService);


	}
}
