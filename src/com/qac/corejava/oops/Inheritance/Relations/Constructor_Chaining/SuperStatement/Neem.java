package com.qac.corejava.oops.Inheritance.Relations.Constructor_Chaining.SuperStatement;

public class Neem extends Tree {
	static byte height;
	static boolean  isfastgrowing;
	static short lifespan;
	
	
	
	
	Neem(byte height,boolean isfastgrowing, short lifespan){
		super("neem",(byte)40);
		this.height=height;
		this. isfastgrowing= isfastgrowing;
		this.lifespan=lifespan;
		System.out.println("Constructor chaining using super statement");
	}
	
	
	
	public static void main(String[] args) {
		Neem a = new Neem((byte)40,true,(short)200);
		System.out.println(Neem.height);
		System.out.println(Neem.isfastgrowing);
		System.out.println(Neem.lifespan);
	}
	
	

}
