package com.QACircle.DtoDao.dto;

public class IphoneDTO extends PhoneDTO{
	private byte ram;
	private String [] features;
	
	 IphoneDTO(){
		 System.out.println("Invoking IphoneDTO ");
		 
	 }

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String[] features) {
		this.features = features;
	}
	 
	 

}
