package com.qac.corejava.oops.Inheritance.TypesOfInheritance.Singlelevel;

public class Testanimal {
	public static void main(String[] args) {
		Cat s = new Cat("Cat", "Felis catus" ,"White",true);
		s.eat();
		System.out.println(s.name);
		System.out.println(s.scientificname);
		System.out.println(s.color);
		System.out.println(s. isCarnivorous);
	}

}
