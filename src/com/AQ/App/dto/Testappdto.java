package com.AQ.App.dto;
import com.AQ.App.dao.Appdao;

public class Testappdto {
	public static void main(String [] args) {
		Appdto app = new Appdto();
		app.setName("Anita");
		app.setEmail("Anita@12gmail.com");
		app.setContactno(9110691034l);
		app.setPassword("Anita@12");
		app.setConformpassword("Anita@12");
		app.setLocation("Gulbarga");
		app.setDateOfbirth("20/09/1999");
	    app.setGender("Female");
	      
	    Appdao dao =new Appdao();
	    dao.print();
	    dao.register(app);
	    String  ab = dao.login("Anita","Anita@12");
	    System.out.println(ab);
	    
	    String h = dao.accountdeleteByIndex(0);
	    
	    System.out.println(h);
	    
		
	}

}
