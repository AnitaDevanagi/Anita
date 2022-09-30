package com.QACircle.DtoDao.dto;
import com.QACircle.DtoDao.dao.PhoneDAO;


public class Testphone {
	public static void main(String [] args) {
		
		String[] features= {"Vedio call","Digital Transaction"};
		IphoneDTO phone = new IphoneDTO();
		phone.setBrandname("Apple");
		phone.setPrice(0);
		phone.setRam((byte)4);
		phone.setFeatures(features);
		
		
		PhoneDAO phone1=new PhoneDAO();
		phone1.save(phone);
		String response=phone1. deleteByBrandname("Apple");
		System.out.println(response);
		
		
		
	}

}
