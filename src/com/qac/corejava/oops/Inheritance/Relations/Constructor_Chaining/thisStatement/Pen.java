package com.qac.corejava.oops.Inheritance.Relations.Constructor_Chaining.thisStatement;

public class Pen {
	 String name;
	static String ink;
	static byte cost;
	
  Pen( String name,String ink ){
	  
	  
	  System.out.println(name);
	  System.out.println(ink);
	 
	  System.out.println(" Pen class Constructor ");
  }
  
  Pen(byte cost){
	  
	  this("Brite","Blue");
	  this.cost=cost;
	 
	  System.out.println(Pen.cost);
	  
	  System.out.println("Invoking Constructor");
	 
	  
  }
	  
	 public static void main(String[] args) {
		 
        Pen s = new Pen((byte)5);
		
		
		 
		  
		  	
	  
	  
  }
}
