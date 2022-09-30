package com.Cir.Book.DTO;

public class BookDTO {
	private String name;
	private Short price;
	
	public BookDTO(){
		System.out.println("BookDTO class Constructor created");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getPrice() {
		return price;
	}

	public void setPrice(Short price) {
		this.price = price;
	}

	
}
	
	



