package com.qac.corejava.oops.corejavaCombines;

public class Monarch extends Butterfly{
	private String scientificname;
	private String habitate;
	private byte sizeininch;
	 
	public Monarch(){
		super("Orange-red");
		System.out.println("The Monarch class constructor");
		
	}
	
	public void eat() {
		System.out.println("The Butterfly eat nectar from flowers and Nectar has a full of sugar");
	}

	public String getScientificname() {
		return scientificname;
	}

	public void setScientificname(String scientificname) {
		this.scientificname = scientificname;
	}

	public String getHabitate() {
		return habitate;
	}

	public void setHabitate(String habitate) {
		this.habitate = habitate;
	}

	public byte getSize() {
		return sizeininch;
	}

	public void setSize(byte sizeininch) {
		this.sizeininch = sizeininch;
	}
	
	
	

}
