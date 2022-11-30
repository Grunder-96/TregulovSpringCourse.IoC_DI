package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Dog dog1 = context.getBean("myPet", Dog.class);
		dog1.setName("Sharik");
		Dog dog2 = context.getBean("myPet", Dog.class);
		dog2.setName("Tuzik");
		System.out.println(dog1.getName());
		System.out.println(dog2.getName());
		System.out.println("Dog1 == Dog2: " + (dog1 == dog2));
		System.out.println(dog1);
		System.out.println(dog2);
		context.close();
	}
}
