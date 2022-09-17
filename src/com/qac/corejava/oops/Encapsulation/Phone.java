package com.qac.corejava.oops.Encapsulation;

public class Phone {
	private  String brandname;
	  private  String modelname;
	  private  int price;
	  private  byte ram;
	  private  String processor;
	  
	  Phone(){
	  System.out.println("About Mobile phone ");
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
	  
	  public void setmodelname(String modelname) {
		  this.modelname=modelname;
	  }
	  
	  public int getprice() {
		   return price;
	  }
	   
	  public void setprice(int price ){
		  this.price=price;
	   }
	  
	  public byte getram() {
		  return ram;
	  }
	  
	  public void setram(byte ram) {
		  this.ram=ram;
	  }
	   
	  public String getprocessor() {
		  return processor;
	  }
	  
	  public void setprocessor(String processor) {
		  this.processor=processor;
	  }
	  
	  public void print() {
	  
	  System.out.println(brandname+"\t"+modelname+"\t"+price+"\t"+ram+"\t"+processor);
	  }
	  
	  public static void main (String[] args) {
		  Phone cd = new Phone();
		  cd.setbrandname("Apple Inc");
		  cd.setmodelname("i phone 13 ");
		  cd.setprice(69000);
		  byte g = 6;
		  cd.setram(g);
		  cd.setprocessor("A15 Bionic");
		  cd.print();
	    }
	 }



