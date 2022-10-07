package com.AQ.App.dto;
import com.AQ.App.dao.App1dao;
import com.AQ.App.dao.App2dao;


import com.AQ.App.dao.Appdao;


public class Testappdto    {
	

	public static void main(String [] args) {
		Appdto instagram = new Appdto();
		instagram.setName("Anita");
		instagram.setEmail("Anita@12gmail.com");
		instagram.setContactno(9110691034l);
		instagram.setPassword("Anita@12");
		instagram.setConformpassword("Anita@12");
		instagram.setLocation("Gulbarga");
		instagram.setDateOfbirth("20/09/1999");
		instagram.setGender("Female");
	      
	    Appdao dao =new Appdao();
	    dao.register(instagram);
	    
	     String s = dao.login("Anita","Anita@12");
	     System.out.println(s);
	   
	     String result= dao.accountdeleteByIndex(0);
	     System.out.println(result);
	    
	     
	     dao.managedata();
	     dao.communicate();
	     dao.datacollect();
	     dao.information();
		System.out.println(App1dao.appname);
		System.out.println(App1dao.features[1]);
		System.out.println(App2dao.name);
		System.out.println(App2dao.features[0]);
		
		dao.login1();
		
	}

}
