package com.qa.animal.DTO;

public class AnimalDTO {
	private String name;
	 private  String color;
	
	
	public AnimalDTO(){
		 System.out.println("AnimalDTO class Constructor ");
	 }
	
	
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}


}
