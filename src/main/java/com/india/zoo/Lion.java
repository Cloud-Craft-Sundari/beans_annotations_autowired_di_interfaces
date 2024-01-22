package com.india.zoo;

import org.springframework.stereotype.Component;


@Component("lion")
public class Lion implements Animal{

	@Override
	public String nameOfAnimal() {
		return "Lion";
	}

	@Override
	public int countOfAnimals() {
		return 10;
	}

	@Override
	public String toString() {
		return "Lion [nameOfAnimal()=" + nameOfAnimal() + ", countOfAnimals()=" + countOfAnimals() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
