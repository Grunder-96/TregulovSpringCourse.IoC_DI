package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person1 = context.getBean("personBean", Person.class);
		System.out.println(person1.getSurname());
		System.out.println(person1.getAge());
//		Person person2 = context.getBean("personBean", Person.class);
//		person.callYourPet();
//		Pet cat1 = context.getBean("catBean", Pet.class);
//		Pet cat2 = context.getBean("catBean", Pet.class);
//		cat.say();
		context.close();
	}
}
