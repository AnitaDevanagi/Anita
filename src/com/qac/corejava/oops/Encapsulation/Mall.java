package com.qac.corejava.oops.Encapsulation;

public class Mall {
	private String name;
	private String owner;
	private int employees;
	private String location;
	
	
	Mall(){
		System.out.println("About Mall");
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getowner() {
		return owner;
	}
	public void setowner(String owner){
		this.owner=owner;
	}
	public int getemployees() {
		return employees;
	}
	
	public void setemployees(int employees) {
		this.employees=employees;
	}
	
	public String getlocation() {
		return location;
	}
	
	public void setlocation(String location) {
		this.location=location;
	}
	
	public void print() {
		System.out.println(name+"\t"+owner+"\t"+employees+"\t"+location);
	}
	
	public static void main(String[] args) {
	    Mall kl = new Mall();
	    kl.setname("Orion Mall");
	    kl.setowner("Uday B Garudacha");
	    kl.setemployees(5000);
	    kl.setlocation("Bangalore");
	    kl.print();
	}

}



