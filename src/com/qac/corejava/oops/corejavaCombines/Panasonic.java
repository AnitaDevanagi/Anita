package com.qac.corejava.oops.corejavaCombines;

public class Panasonic implements Tv {
	 String screentype;
	 boolean issmartTv;
	 
	public Panasonic(){
		System.out.println("Panasonic tv constructor");
		 
	 }
	
	public  void watch() {
		System.out.println("Tv is used to watch the movies and news");
		
	}
	public void powercomsumption() {
		System.out.println("Tv cosume power");
	}
	

}
