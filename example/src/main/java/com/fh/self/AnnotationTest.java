package com.fh.self;

public class AnnotationTest {

	public static void main(String[] args) {
		City city = new City();
		Class<? extends City> aClass = city.getClass();
		if(aClass.isAnnotationPresent(Entity.class)){
			Entity annotation = aClass.getAnnotation(Entity.class);
			System.out.println(annotation.value());
		}
	}
}
