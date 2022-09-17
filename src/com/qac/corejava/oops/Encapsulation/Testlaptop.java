package com.qac.corejava.oops.Encapsulation;

public class Testlaptop {
	public static void main(String[] args) {
		Laptop abc = new Laptop();
		abc.setbrandname("HP");
		abc.setmodelname("Victus 15");
		abc.setprice(60000);
		abc.setram((byte)8);
		abc.setos("Window 10");
		abc.setprocessor("i5");
		abc.print();

    }

}
