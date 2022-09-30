package com.AQ.Train.DTO;

public class TrainDTO {
	private String name;
	private byte compartments;
	
	TrainDTO(){
		System.out.println("TrainDTO class Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getCompartments() {
		return compartments;
	}

	public void setCompartments(byte compartments) {
		this.compartments = compartments;
	}
	
	

}
