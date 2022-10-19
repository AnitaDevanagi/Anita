package com.qac.corejava.Collection.dao;

import java.util.HashSet;

import com.qac.corejava.Collection.dto.Accountdetailsdto;


public class Accountdetailsdao {
	HashSet data = new HashSet();
	
	public String save(Accountdetailsdto dto) {
		data.add(dto);
		return dto.getName()+"data saved";
	}
	
	public  HashSet searchByAccountnumber(String accountnumber) {
	  Object [] accountdetails= data.toArray();
		for(Object object : accountdetails) {
			if(data.equals(accountnumber)) {
				 return (HashSet) object;
			 }
			
		}
		return null;
	
	}
	
	public  HashSet searchByIfsc(String ifsc) {
		Object [] accountdetails= data.toArray();
		for(Object object : accountdetails) {
			if(data.equals(ifsc)) {
				 return (HashSet) object;
			 }
			
		}
		return null;
	
	}
	public  HashSet removeByAccountnumber(String accountnumber) {
		Object [] accountdetails= data.toArray();
		for(Object object : accountdetails) {
			if(data.equals(accountnumber)) {
				 return (HashSet) object;
			 }
			
		}
		return null;
	
	}
	
	
	
	

}
