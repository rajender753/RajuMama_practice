package com.valuelabescompany.valuelabs.dto;

public class AddressDto {
	String hno;
	
	String postalcode;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	

	public AddressDto() {
		super();
	}

	public AddressDto(String hno, String postalcode) {
		super();
		this.hno = hno;
		this.postalcode = postalcode;
	}
	
	
	
	
	

}
