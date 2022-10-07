package com.AQ.App.dao;
import com.AQ.App.dto.Appdto;

public class Appdao {
	
	Appdto [] details = new Appdto[10];
	  
	  private int i;
	public void register(Appdto app) {
		details[i++]=app;
		
		}
	
		
	
	public String login (String name , String password) {
		for(i=0;i<details.length;i++) {
		if(details[i]!=null && details[i].getName().equals(name) && details[i].getPassword().equals(password)) {
			
			return "login  successful";
			
		    }	
		}
		 return "login fail";
		
	}
	
	public  String accountdeleteByIndex(int index) {
		
			if(details[i]!=null)  {
				details[0]=null;
			}
			return "account deleted";
		}

	
	
	public  void print () {
		
	for(int i=0; i<details.length;i++) {
		if(details[i]!=null) {
		System.out.println(details[i].getName());
		
	}
		
	}
	
		
		
	}

}
