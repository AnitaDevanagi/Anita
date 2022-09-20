package com.qac.corejava.oops.Inheritance.Relations.Constructor_Chaining.SuperStatement;

public class Tree {
	String name;
	byte height;
	
	
	Tree(){
		System.out.println("default constructor");
		
	}
	
   Tree(String name,byte height){
	   System.out.println("Invoking constructor");
	   System.out.println(name);
	   System.out.println(height);
   }
}
