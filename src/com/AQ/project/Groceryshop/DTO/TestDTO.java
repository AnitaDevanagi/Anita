package com.AQ.project.Groceryshop.DTO;

import com.AQ.project.Groceryshop.DAO.GroceryShopDAO;

import java.util.TreeSet;

public class TestDTO {
	public static void main(String[] args) {
		ProductDTO product = new ProductDTO();
		product.setNameOfproduct("Sunflower oil");
		product.setMRPrice(165);
		product.setBarcodenumber((long)890600728);
		product.setDto(null);
		product.setIsveg(false);
		product.setManufacturingdate("12/06/2022");
		product.setExpirydate("15/02/2023");
		product.setQuality(78);
		
		ManufacturercompanyDTO Manufacturercompany = new ManufacturercompanyDTO();
		Manufacturercompany.setCompanyname("Adani Wilmar Limited");
		Manufacturercompany.setContactno(04067067600);
		Manufacturercompany.setMailid("darshil.lakhia@adaniwilmar.in");
		
		AddressDTO address = new AddressDTO();
		address.setBuildingno("No.48,oop World of Titan");
		address.setArea("Indiranagar");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setZip(560038);
		
        GroceryShopDAO shop = new GroceryShopDAO ();
		String  display  = shop.removeProctByCompanyName("Sunflower oil","Adani Wilmar Limited");
		System.out.println(display);
		
		ManufacturercompanyDTO  show  = shop.getAllProductByCompanyName("Adani Wilmar Limited");
		System.out.println(show);
		
		ProductDTO  s  = shop.getAllProductBynameofpruduct("Sunflower oil");
		System.out.println(s);
		
		shop.showallprodut();
		
		int  abc  = shop.totalNumberOfProduct();
		System.out.println(abc);
		
	}

}
