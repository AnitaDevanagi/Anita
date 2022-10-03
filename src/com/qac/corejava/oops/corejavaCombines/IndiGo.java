package com.qac.corejava.oops.corejavaCombines;

public class IndiGo extends Airplane {
	static short noOfpassangers;
	static int noOfemployee;
	byte noOfpilots;
	
	public 	IndiGo (short noOfpassangers,int noOfemployee){
		this.noOfpassangers=noOfpassangers;
		this.noOfemployee=noOfemployee;
		
		
		
		
	}
	
	public   void fly () {
		System.out.println("The Airpalne is fly based on Bernolli principle");
		
	}

}
