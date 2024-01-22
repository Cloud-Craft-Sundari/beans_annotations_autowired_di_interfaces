package com.india.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalManagement")
public class AnimalManagement {

	private String managementName;	
//	@Qualifier("lion")
	@Autowired
	private Animal animal;
	
	public AnimalManagement() {
		
	}

	public String getManagementName() {
		return managementName;
	}

	public void setManagementName(String managementName) {
		this.managementName = managementName;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "AnimalManagement [managementName=" + managementName + ", animal=" + animal + "]";
	}
	
	

}
