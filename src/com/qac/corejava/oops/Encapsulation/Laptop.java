package com.qac.corejava.oops.Encapsulation;

public class Laptop {
	private String brandname;
	private String modelname;
	private int price;
	private byte ram;
	private String os;
	private String processor;
	 
	 Laptop(){
		 System.out.println("Encapsulation");
	   }
	 
	public String getbrandname() {
		return brandname;
	  }
	
	public void setbrandname(String brandname) {
		this.brandname=brandname;
	  }
	
	public String getmodelname() {
	     return modelname;
	 }
	
	 public void setmodelname(String modelname){
		 this.modelname=modelname;
		 
	  }
	 
	 public int getprice() {
		 return price;
	 }
	 
	 public void setprice(int price) {
		 this.price=price;
	  }
	 
	 public byte getram() {
		 return ram;
	 }
	 
	  public void setram(byte ram) {
		 this.ram=ram;
	  }
	  
	 public String getos() {
	   return os;
	   }
	 
	 public void setos(String os) {
		 this.os=os;
	   }
	 
	 public String getprocessor() {
		 return processor;
	   }
	 
	 public void setprocessor(String processor) {
		 this.processor=processor;
	   }
	  
	 
     public void print() {
    	 System.out.println(brandname+"\t"+modelname+"\t"+price+"\t"+ram+"\t"+os+"\t"+processor);
         }
	 
	}





