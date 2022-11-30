package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Person person = context.getBean("personBean", Person.class);
		person.callYourPet();
//		Cat cat = context.getBean("cat", Cat.class);
//		cat.say();
		context.close();
	}
}
