package com.zaurtregulov.spring.IoC_DI.spring_introduction;

public class Dog implements Pet {
	
	public Dog() {
		System.out.println("Dog been is created");
	}
	
	@Override
	public void say() {
		System.out.println("Bow-Wow");
	}
}
