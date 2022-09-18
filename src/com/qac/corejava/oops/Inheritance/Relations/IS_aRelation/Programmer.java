package com.qac.corejava.oops.Inheritance.Relations.IS_aRelation;

public class Programmer extends Employee {
	String name;
	String address;
	int salary;
	byte workinghours;
	
	Programmer(String name,String address, int salary,byte workinghours, long phoneno){
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.workinghours=workinghours;
		this.phoneno=phoneno;
		
	}
	
	public static void main(String [] args) {
	     long  b = 9008492289l;
		Programmer a = new Programmer("Ankita" ,"Bangalore",25000,(byte)8,b);
		
		System.out.println(a.name);
		System.out.println(a.address);
		System.out.println(a.salary);
		System.out.println(a.workinghours);
		System.out.println(a.phoneno);
		
	}

}
