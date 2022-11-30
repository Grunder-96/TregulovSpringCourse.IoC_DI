package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import org.springframework.stereotype.Component;

@Component()
public class Cat implements Pet{
	
	public Cat() {
		System.out.println("Cat bean is created");
	}
	
	@Override
	public void say() {
		System.out.println("Meow-Meow");
	}
}
