package com.zaurtregulov.spring.IoC_DI.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
	
	private Pet pet;
	private String surname;
	private int age;

//	Начиная со spring 4.3, при наличии одного конструктора указывать аннотацию Autowired необязательно
	@Autowired
	public Person(Pet pet) {
		System.out.println("Person been is created");
		this.pet = pet;
	}
	
//	public Person() {
//		System.out.println("Person been is created");
//	}
	
	//Pet -> setPet
	public void setPet(Pet pet) {
		System.out.println("Class person: set Pet");
		this.pet = pet;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		System.out.println("Class person: set surname");
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Class person: set age");
		this.age = age;
	}

	public void callYourPet() {
		System.out.println("Hello, my lovely pet!");
		pet.say();
	}
}
