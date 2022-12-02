package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog implements Pet {
	
//	private String name;
	
	public Dog() {
		System.out.println("Dog bean is created");
	}
	
	@Override
	public void say() {
		System.out.println("Bow-Wow");
	}
	
//	@PostConstruct
//	public void init() {
//		System.out.println("class Dog: init-method");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("class Dog: destroy-method");
//	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}
