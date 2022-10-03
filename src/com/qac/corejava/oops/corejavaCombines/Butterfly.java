package com.qac.corejava.oops.corejavaCombines;

public class Butterfly {
	private String name;
	private String color;
	private int lifespan;
	
	public Butterfly(String color){
		this((byte)8);
		this.color=color;
		System.out.println("The Butterfly class constructor");
		System.out.println(color);
	  }
	
	public Butterfly(int lifespan) {
		this.lifespan=lifespan;
		System.out.println(lifespan);
		
	}
	
	public void eat() {
		System.out.println("The Butterfly eat nectar from flowers");
	}
	
	public void fly() {
		System.out.println("The Butterfly can fly");
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
		this.color = color;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	
}
