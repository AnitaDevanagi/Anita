package com.QACircle.DtoDao.dto;

public class ProgrammerDTO extends EmployeeDTO {
	private String companyname;
	private String location;
	
	ProgrammerDTO(){
		System.out.println("ProgrammerDTO Class Constructor ");
		
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
