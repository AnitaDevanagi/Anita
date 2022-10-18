package com.qac.corejava.Collection.TrainLinkedList.dao;

import java.util.LinkedList;

import com.qac.corejava.Collection.dto.Traindto;

public class Traindaolist {
	
		
		LinkedList train = new LinkedList();
		
		
		public String save(Traindto dto) {
			train.add(dto);
			
			return dto.getName()+"data Saved";
		}
		
		public Traindto getByName(String name) {
			for(int i=0 ; i<train.size();i++) {
				Traindto dto=(Traindto)train.get(i);
			
				if(dto.getName().equals(name)) {
				      return dto;
				}
			}
			return null;
			
		}
		
		

	    public String removeByname(String name) {
	  	  for(int i=0; i<train.size(); i++) {
				 if(train.equals(name)) {
					name=null; 
				}
	  	  
	    }
	  	  
			return "removed name" +" "+  name;
			
	    }
		
		
		public LinkedList getByname(String name) {
			LinkedList list1 =new LinkedList();
			for(int i=0 ; i<train.size();i++) {
				Traindto dto=(Traindto)train.get(i);
			
				if(dto.getName().equals(name)) {
				  list1.add(dto);
				}
			}
			return list1;
			
		}
		
		public LinkedList getByOrigin(String origin) {
			LinkedList g =new LinkedList();
			for(int i=0 ; i<train.size();i++) {
				Traindto dto =(Traindto)train.get(i);
			
				if(dto.getName().equals(origin)) {
				  g.add(dto);
				}
			}
			return g;
			
		}
		
		public LinkedList  getAll() {
		    return train;
		}


			
		}
		
		

	  
	      
	       
		
		

	    
			
	      

	      
	         
	         




