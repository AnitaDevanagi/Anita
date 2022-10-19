package com.qac.corejava.Collection.dto;

import java.util.HashSet;

import com.qac.corejava.Collection.dao.Accountdetailsdao;

public class Testaccountdetails {
	public static void main(String[] args) {
		Accountdetailsdto details = new 	Accountdetailsdto();
		details.setName("Keerthi");
		details.setAccountnumber("45327890543");
		details.setContact("9001267898");
		details.setEmail("keerthi123@gmail.com");
		details.setIfse("SBIN9085678");
		
		Accountdetailsdao abc = new Accountdetailsdao();
		abc.save(details);
		String  result = abc.searchByAccountnumber("45327890543");
		System.out.println(result);
		
		 HashSet  result1 = abc.searchByName("Keerthi");
		 System.out.println(result1);
		 
		 String  result2 = abc.removeByAccountnumber("45327890543");
		 System.out.println(result2);
		
	}
	

}
