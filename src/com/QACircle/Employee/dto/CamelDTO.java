package com.QACircle.Employee.dto;

public class CamelDTO extends AnimalDTO{
	private String Stay;
    private boolean isherbivorous;
    
    CamelDTO(){
    	System.out.println("Invokig CamelDTO");
    }

	public String getStay() {
		return Stay;
	}

	public void setStay(String stay) {
		Stay = stay;
	}

	public boolean isIsherbivorous() {
		return isherbivorous;
	}

	public void setIsherbivorous(boolean isherbivorous) {
		this.isherbivorous = isherbivorous;
	}

    
}
