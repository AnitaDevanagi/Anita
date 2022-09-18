package com.qac.corejava.oops.Inheritance.Relations.IS_aRelation;

public class Animal {
   private  String name;
   private char color;
   private byte noOflegs;
   private  byte tail;
   
   public Animal() {
	   System.out.println("Invoking Animal Constructor");
   }
   
   public String getname() {
	   return name;
   }
   
   public void setname(String name) {
	   this.name=name;
   }
   
   public  char getcolor() {
	   return color;
   }
   
   public void setcolor(char color) {
	   this.color=color;
   }
   
   public byte getnoOflegs() {
	   return noOflegs;
   }
   
   public void setnoOflegs(byte noOflegs) {
	   this.noOflegs=noOflegs;
   }
   
   public byte gettail() {
	   return tail;
   }
   
   public void settail(byte tail) {
	   this.tail=tail;
   }
  
 }



	

