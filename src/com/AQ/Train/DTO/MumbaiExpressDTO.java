package com.AQ.Train.DTO;

public class MumbaiExpressDTO extends TrainDTO {
	private boolean ishavingACcoach;
	private String startfrom;
	
	 MumbaiExpressDTO(){
			System.out.println("MumbaiExpressDTO class Constructor");
	 }

	public boolean isIshavingACcoach() {
		return ishavingACcoach;
	}

	public void setIshavingACcoach(boolean ishavingACcoach) {
		this.ishavingACcoach = ishavingACcoach;
	}

	public String getStartfrom() {
		return startfrom;
	}

	public void setStartfrom(String startfrom) {
		this.startfrom = startfrom;
	}
	 
	
	

}
