package com.india.zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApplication {


	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) context).scan("com.*");
		((AbstractApplicationContext) context).refresh();
		
		Animal a1 = (Lion)context.getBean("lion");
		System.out.println(a1.nameOfAnimal());
		System.out.println(a1.countOfAnimals());
		
		AnimalManagement am1 = (AnimalManagement) context.getBean("animalManagement");
		System.out.println(am1);
	}

}
