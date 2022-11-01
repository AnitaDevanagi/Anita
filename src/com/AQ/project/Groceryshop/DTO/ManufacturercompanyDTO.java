package com.AQ.project.Groceryshop.DTO;

public class ManufacturercompanyDTO {
	private String companyname;
	private  AddressDTO add;
	private long contactno;
	private String mailid;
	

	 ManufacturercompanyDTO(){
		 System.out.println("invoking" + getClass().getSimpleName()+"constructor");
	 }
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public AddressDTO getAdd() {
		return add;
	}

	public void setAdd(AddressDTO add) {
		this.add = add;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	 
	 
}
