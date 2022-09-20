package com.qac.corejava.oops.Inheritance.Relations.Constructor_Chaining.thisStatement;

public class Train {
	String name;
	byte compartments;
	
	Train(){
		this("Mumbai Express", (byte)10);
		
		System.out.println("Constructor chaining ");
		}
	
	   
	   
	 Train(String name, byte compartments){
		    System.out.println("Constructor with parameters ");
		    System.out.println(name);
		    System.out.println(compartments);
		   
	   }
	
	public static void main(String[] args) {
		Train a = new Train();
		
	}   
	
	 
}
