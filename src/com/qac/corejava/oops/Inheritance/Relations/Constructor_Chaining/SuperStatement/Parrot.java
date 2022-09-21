package com.qac.corejava.oops.Inheritance.Relations.Constructor_Chaining.SuperStatement;

public class Parrot extends Bird {
	
	String scientificname;
	static char color;
	static byte lifespan;
	
	Parrot(String scientificname, char color, byte lifespan){
		super((byte)60);
		
		System.out.println("Parrot class constructor");
		this.scientificname=scientificname;
		this.color=color;
		this.lifespan=lifespan;
		
		
		
		
	}
	
	public static void main(String [] args) {
		Parrot d = new Parrot("Psittaciformes",'G',(byte)50);
		System.out.println(d.scientificname);
		System.out.println(Parrot.color);
		System.out.println(d.lifespan);		
	
		
		}
}
