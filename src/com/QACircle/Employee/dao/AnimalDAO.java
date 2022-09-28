package com.QACircle.Employee.dao;
import com.QACircle.Employee.dto.CamelDTO;

public class AnimalDAO {
	
	private CamelDTO [] cameldto = new CamelDTO [5]; 
	
	public void save(CamelDTO camel) {
		cameldto[0]=camel;
	}
	public String deleteByStay(String stay) {
		for(int i=0; i<cameldto.length;i++) {
			if(cameldto[0]!= null && cameldto[i].getStay().equals(stay)) {
				cameldto[i]=null;
				return "Deleted"+ stay;
			}
		} 
		
		 return "Stay"+ stay +"not present";
	}
		
	}
	


