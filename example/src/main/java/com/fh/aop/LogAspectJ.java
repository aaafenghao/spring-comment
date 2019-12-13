package com.fh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class LogAspectJ {

	/**
	 * 当使用jdk做动态代理的时候,是基于共同的接口,做了一次实现,
	 * this,代表的是代理对象,使用jdk动态代理的话相当于是两个具有相同的接口的不同的实现,可以使用共同的接口做表达式
	 */
	@Pointcut("this(com.fh.aop.IndexDao)")
	public void aopthis(){}

	/**
	 * target 代表的是原始的对象,原始的对象是不会变的
	 */
	@Pointcut("target(com.fh.aop.IndexDao)")
	public void aopTarget(){}

	@Before(value = "aopTarget()")
	public void log(){
		System.out.println("before");
	}

	@Pointcut("@annotation(org.springframework.scheduling.annotation.Async)")
	public void aopAnnotion(){}

	@Around(value = "aopAnnotion()")
	public void timeLog(ProceedingJoinPoint point){
		StopWatch watch = new StopWatch();
		watch.start();
		try {
			point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}finally {
			watch.stop();
			System.out.println(watch.getTotalTimeSeconds());
		}
	}
}
