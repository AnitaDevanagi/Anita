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
	    
	    Traindao s = new Traindao();
	    
	    String hg = s.getByName("Avankita Express", s);
	    System.out.println(hg);
	    
	    String h = s.removeByname("Avankita Express", s);
	    System.out.println(h);
	    
	    s.getAll(0, null);
	  
	    System.out.println(details);

	}
}



 