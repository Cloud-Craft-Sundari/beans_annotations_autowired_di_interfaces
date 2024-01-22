package com.india.zoo;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("tiger")
public class Tiger implements Animal{

	public Tiger() {
	
	}

	@Override
	public String nameOfAnimal() {
		
		return "Tiger";
	}

	@Override
	public int countOfAnimals() {
		
		return 20;
	}

	@Override
	public String toString() {
		return "Tiger [nameOfAnimal()=" + nameOfAnimal() + ", countOfAnimals()=" + countOfAnimals() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
