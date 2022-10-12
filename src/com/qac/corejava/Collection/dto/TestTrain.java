package com.qac.corejava.Collection.dto;

import java.util.ArrayList;

import com.qac.corejava.Collection.dao.Traindao;

public class TestTrain {
	
	public static void main(String[] args) {
	    Traindto details = new Traindto();
	    details.setName("Avankita Express");
	    details.setOrigin("Indore Jn");
	    details.setDestination("Mumbai Central");
	    details.setSpeed("130kmph");
	    
	    Traindto details1 = new Traindto();
	    details1.setName("Rajdhani Express");
	    details1.setOrigin("Bangalore Cy junction");
	    details1.setDestination("H Nizamuddin");
	    details1.setSpeed("140kmph");
	    
	    Traindto details2 = new Traindto();
	    details2.setName("Shatabdi Express");
	    details2.setOrigin("Habib Ganj");
	    details2.setDestination("New Dahli");
	    details2.setSpeed("132kmph");
	    
	    
	  Traindao dao = new Traindao();
      dao.save(details);
      dao.save(details2);
      dao.save(details2);
      
      String response = dao.removeByname("Shatabdi Express");
      System.out.println(response);
      
      ArrayList  result = dao.getByname("Shatabdi Express");
      System.out.println(result);
       
      ArrayList  reply = dao.getByOrigin("Habib Ganj");
      System.out.println(reply);
       
      ArrayList res  =  dao.getAll();
      System.out.println(res);
	}
}



 