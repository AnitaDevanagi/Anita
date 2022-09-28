package com.QACircle.Employee.dto;

public class ScienceDTO extends BookDTO {
	private Short noOfpages;
	private String version;
	
	ScienceDTO(){
		System.out.println("Constructor created");
	}

	public Short getNoOfpages() {
		return noOfpages;
	}

	public void setNoOfpages(Short noOfpages) {
		this.noOfpages = noOfpages;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
