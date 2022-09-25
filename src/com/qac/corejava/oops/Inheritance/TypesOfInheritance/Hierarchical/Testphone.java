package com.qac.corejava.oops.Inheritance.TypesOfInheritance.Hierarchical;

public class Testphone {
    public static void main(String[] args) {
    	 Lenovo a =new Lenovo("lenovo","Lenovo Z6 Pro",40000);
    	 Vivo b = new Vivo("Vivo","Vivo T1",16000);
    	 System.out.println(a.brandname);
    	 System.out.println(a.modelname);
    	 System.out.println(a.price);
    	 
    	 System.out.println(b.brandname);
    	 System.out.println(b.modelname);
    	 System.out.println(b.price);
    }
}
