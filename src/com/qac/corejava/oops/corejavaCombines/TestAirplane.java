package com.qac.corejava.oops.corejavaCombines;

public class TestAirplane {
  public static void main(String[] args) {
	  
	  IndiGo indigo = new IndiGo((short)360,23711);
	  indigo.name="Indigo";
	  indigo.speedkmh= 850;
	  indigo.noOfpilots=(byte)2;
	  
	  System.out.println(indigo.name);
	  System.out.println(indigo.speedkmh);
	  System.out.println(indigo.noOfpilots);
	  
	  
	  System.out.println(IndiGo.noOfemployee);
	  System.out.println(IndiGo.noOfpassangers);
	 
	
	  
	  
	  
	  
	  
	  
  }
}
