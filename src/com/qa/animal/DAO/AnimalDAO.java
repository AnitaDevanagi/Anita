package com.qa.animal.DAO;
import com.qa.animal.DTO.CamelDTO;

public class AnimalDAO {
	private CamelDTO [] cameldto = new CamelDTO [6]; 
	 int i;
	public void save(CamelDTO camel) {
		cameldto[i++]=camel;
		System.out.println(cameldto[i]);
	}
	
	public String deleteByStay(String stay) {
		for(int i=0; i<cameldto.length; i++) {
			if(cameldto[i]!= null && cameldto[i].getStay().equals(stay)) {
				cameldto[i]=null;
				return "Deleted"+ stay;
			}
		} 
	
		
		return "Stay"+ stay +"not present";
	}
		
		public String addByColor(String color) {
			for(int i=0; i<cameldto.length; i++) {
				if(cameldto[i]!= null && cameldto[i].getColor().equals(color)) {
				
					return "Added"+ color;
				}
			}
		
		 return "Color"+ color +"not added";
	}
	
	 public void print() {
		for(int i=0;i<cameldto.length;i++) {
			System.out.println(cameldto[0]);
		}
	}
	
}
		


