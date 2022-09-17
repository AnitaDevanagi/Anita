package com.qac.corejava.oops.Encapsulation;

public class Book {
	private String name;
	private String authors;
	private int year;
	private short pages;
	private String publisher;
	private String type;
	
	Book(){
	System.out.println("About Book");
	}
	
	public String getname() {
	  return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getauthors() {
		return authors;
     }
	
	public void setauthors(String authors) {
		this.authors=authors;
	}
	 
	public int getyear() {
		return year;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	public short getpages() {
		return pages;
	}
	
	public void setpages(short pages) {
		this.pages=pages;
	}
	
	public String getpublisher() {
		return publisher;
	}
	
	public void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public String gettype() {
		return type;
	}
	
	public void settype(String type) {
		this.type=type;
	}
	
	public void print() {
		System.out.println(name+"\t"+authors+"\t"+year+"\t"+pages+"\t"+publisher+"\t"+type);
	}

	
}



