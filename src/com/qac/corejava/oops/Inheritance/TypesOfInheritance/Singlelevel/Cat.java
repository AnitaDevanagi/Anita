package com.qac.corejava.oops.Inheritance.TypesOfInheritance.Singlelevel;

 public class Cat extends Animal {
	 String scientificname;
	 String color;
	 Boolean isCarnivorous;
	
	public Cat (String name, String scientificname, String color,	 Boolean isCarnivorous){
		this.name=name;
		this.scientificname = scientificname;
		this.color=color;
		this.isCarnivorous=isCarnivorous;
		
	
		
	}
	
	public void eat() {
		System.out.println("Its eat chicken");
		
	}
}

