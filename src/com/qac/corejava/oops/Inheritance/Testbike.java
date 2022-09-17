package com.qac.corejava.oops.Inheritance;
import  com.qac.corejava.oops.Inheritance.Relations.Has_Arelation.Bike;
import  com.qac.corejava.oops.Inheritance.Relations.Has_Arelation.Engine;



public class Testbike {
    public static void main(String []args) {
    	
    	Bike b = new Bike();
    	b.setbrandname("Hero Honda");
    	b.setmodelname("Hero Glamour");
    	b.setprice(76500);
    	
    	Engine e = new Engine();
    	e.setbrandname("Hero");
    	e.setcapacity(124);
    	e.setnoOfstrokes((byte)4);
    	
    	System.out.println(b.getbrandname());
    	System.out.println(b.getmodelname());
    	System.out.println(b.getprice());
    	
    	System.out.println(e.getbrandname());
    	System.out.println(e.getcapacity());
    	System.out.println(e.getnoOfstrokes());
    	
    }
}
