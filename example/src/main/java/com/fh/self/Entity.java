package com.fh.self;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解出现的地方
@Target(ElementType.TYPE)
//注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

	String value();
}
