package com.QACircle.DtoDao.dto;

public class EmployeeDTO {
	private String name;
	private int salary;
	
	EmployeeDTO(){
		System.out.println("EmployeeDTO Class Constructor ");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
    
	

}
