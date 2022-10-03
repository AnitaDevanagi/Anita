package com.qac.corejava.oops.corejavaCombines;

public abstract class  Airplane {
	String name;
	int speedkmh;
	

	
    public  abstract  void fly ();
      
      Airplane(){
    	  System.out.println("Airplane class constructor");
    	  
      }
      
      public void tarvel() {
    	  System.out.println("Airplane is used for travelling");
      }
      
      
      

}
