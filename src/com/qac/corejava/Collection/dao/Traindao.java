package com.qac.corejava.Collection.dao;


import java.util.ArrayList;

import com.qac.corejava.Collection.dto.Traindto;

public class Traindao {
  
      
      ArrayList<String> train =new ArrayList<String>();
	
	 public void save(ArrayList<String> details) {
    	 train=details; 
      }
      
      public String getByName(String name, Object details) {
    	  for(int i=0; i<train.size(); i++) {
  			 if(train.equals(details)) {
  			}
    	  
      }
		return name;
      }
      
      public String removeByname(String name, Object details) {
    	  for(int i=0; i<train.size(); i++) {
  			 if(train.equals(details)) {
  				name=null; 
  			}
    	  
      }
		return "removed name" +" "+  name;
      }
   



      
      public void getAll(int i, ArrayList<String> details ) {
    	  System.out.println(train.get(0));
    	  
      }

	

		
	}
       
      
     
    
	
	

    
		
      

      
         
         

