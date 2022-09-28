package com.QACircle.Employee.dao;
import com.QACircle.Employee.dto.IphoneDTO;


public class PhoneDAO {
  
	  private  IphoneDTO [] iphone = new   IphoneDTO[8];
	   
	   public void save(IphoneDTO phone) {
		   iphone[0]= phone;
	   }
	   
	   public String  deleteByBrandname(String brandname) {
		   System.out.println(iphone[0]);
		   
		   for( int i=0; i<iphone.length;i++) {
			  
			   if(iphone[0]!=null && iphone[i].getBrandname().equals(brandname)) {
				   iphone[i]=null;
				   return "Deleted " +brandname;
			   }
		   }
		   return "brandname"+brandname+"not present";
		   
	   }
}
