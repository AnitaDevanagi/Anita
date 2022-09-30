package com.qa.animal.DTO;
import com.qa.animal.DAO.AnimalDAO;

public class Testanimal {
	public static void main(String [] args) {
		CamelDTO camel = new CamelDTO();
		camel.setName("Camel");
		camel.setStay("desert");
	    camel.setColor("light yellowish brown");
		camel.setIsherbivorous(true);
		
		CamelDTO camel2 = new CamelDTO();
		camel2.setName("Camel2");
		camel2.setStay("desert");
	    camel2.setColor("light yellow");
		camel2.setIsherbivorous(false);
		
		
		AnimalDAO animal = new AnimalDAO();
		animal.save(camel);
		
	    String g = animal.deleteByStay("desert");
	    System.out.println(g);
	    
	    String result =animal.addByColor("yellow");
	    System.out.println(result);
	    
	    animal.print();
	    
	}

}



