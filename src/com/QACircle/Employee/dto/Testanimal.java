package com.QACircle.Employee.dto;
import com.QACircle.Employee.dao.AnimalDAO;

public class Testanimal {
	public static void main(String [] args) {
		CamelDTO camel = new CamelDTO();
		camel.setName("Camel");
		camel.setStay("desert");
	    camel.setColor("gray");
		camel.setIsherbivorous(true);
		
		AnimalDAO animal = new AnimalDAO();
		animal.save(camel);
	    String g = animal.deleteByStay("deset");
	    System.out.println(g);
	}

}
