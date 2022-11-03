package com.AQ.project.Groceryshop.DTO;

import com.AQ.project.Groceryshop.DAO.GroceryShopDAO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TestDTO {
	public static void main(String[] args) {
		ProductDTO product = new ProductDTO();
		product.setNameOfproduct("Sunflower oil");
		product.setMRPrice(165);
		product.setBarcodenumber((long)890600728);
		
		product.setIsveg(false);
		product.setManufacturingdate("12/06/2022");
		product.setExpirydate("15/02/2023");
		product.setQuality(78);
		
		ManufacturercompanyDTO manufacturercompany = new ManufacturercompanyDTO();
		manufacturercompany.setCompanyname("Adani Wilmar Limited");
		manufacturercompany.setContactno(04067067600);
		manufacturercompany.setMailid("darshil.lakhia@adaniwilmar.in");
		product.setDto(manufacturercompany);
		
		AddressDTO address = new AddressDTO();
		address.setBuildingno("No.48,oop World of Titan");
		address.setArea("Indiranagar");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setZip(560038);
		manufacturercompany.setAdd(address);
		
        GroceryShopDAO shop = new GroceryShopDAO ();
        shop.addproduct(product);
        
		String  display  = shop.removeProctByCompanyName("Sunflower oil","Adani Wilmar Limited");
	    System.out.println(display);
		
        HashSet  show  = shop.getAllProductByCompanyName("Adani Wilmar Limited");
		System.out.println(show);
		
		HashSet  s  = shop.getAllProductBynameofpruduct("Sunflower oil");
		System.out.println(s);
		
	    int  show1  = shop.totalNumberOfProduct();
		System.out.println(show1);
		
	    List  show2 = shop.getAllVegProduct();
		System.out.println(show2);
		 
		LinkedList  show3 = shop.getAllNonVegProduct();
		System.out.println(show3);
		
		shop.showAllProduct();
		
	}

}
