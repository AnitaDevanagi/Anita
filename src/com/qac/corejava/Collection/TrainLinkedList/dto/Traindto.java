package com.qac.corejava.Collection.TrainLinkedList.dto;


public class Traindto {
	      private  String name;
	      private  String origin;
	      private  String destination;
	      private  String speed;
		
	      
	      
	     public Traindto(){
	    	 System.out.println("invikong" + getClass().getSimpleName()+"Constructor");
	    	}
	     
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getSpeed() {
			return speed;
		}
		public void setSpeed(String speed) {
			this.speed = speed;
		}
		
		 public  String toString() {
			 return "[Name :  "+name+"\t Origin : "+origin+"\t Destination : "+destination+"\t  Speed: "+speed+"\t ]";
					 
		 }
		
	}


