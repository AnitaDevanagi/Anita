package com.qac.corejava.oops.Inheritance.Relations.Has_Arelation;

public class Engine {
	private String brandname;
	private int capacity;
	private byte noOfstrokes;
	
	public Engine(){
	}
	
	public String getbrandname() {
		return brandname;
    }
	
	public void setbrandname(String brandname) {
		this.brandname=brandname;
	}
	
	public int getcapacity() {
		return capacity;
	}
	 
	public void setcapacity(int capacity) {
		this.capacity=capacity;
	}
	
	public byte getnoOfstrokes() {
		return noOfstrokes;
	}
	public void setnoOfstrokes(byte noOfstrokes) {
		this.noOfstrokes=noOfstrokes;
	}

}


