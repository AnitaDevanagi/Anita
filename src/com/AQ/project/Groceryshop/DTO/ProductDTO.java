package com.AQ.project.Groceryshop.DTO;

public class ProductDTO {
	private String nameOfproduct;
	private double MRPrice;
	private long barcodenumber;
	private ManufacturercompanyDTO dto;
	private boolean isveg;
	private String manufacturingdate;
	private String expirydate;
	private int quality;
	
	ProductDTO(){
		  System.out.println("invoking"+ getClass().getSimpleName()+"Constructor");
		}
    public String getNameOfproduct() {
		return nameOfproduct;
	}

	public void setNameOfproduct(String nameOfproduct) {
		this.nameOfproduct = nameOfproduct;
	}

	public double getMRPrice() {
		return MRPrice;
	}

	public void setMRPrice(double mRPrice) {
		MRPrice = mRPrice;
	}

	public long getBarcodenumber() {
		return barcodenumber;
	}

	public void setBarcodenumber(long barcodenumber) {
		this.barcodenumber = barcodenumber;
	}

	public ManufacturercompanyDTO getDto() {
		return dto;
	}

	public void setDto(ManufacturercompanyDTO dto) {
		this.dto = dto;
	}

	public boolean isIsveg() {
		return isveg;
	}

	public void setIsveg(boolean isveg) {
		this.isveg = isveg;
	}

	public String getManufacturingdate() {
		return manufacturingdate;
	}

	public void setManufacturingdate(String manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}
	
	
    

}
