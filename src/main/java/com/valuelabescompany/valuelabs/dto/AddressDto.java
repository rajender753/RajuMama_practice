package com.valuelabescompany.valuelabs.dto;

public class AddressDto {
	
	String hNo;
	
	String postelCode;

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getPostelCode() {
		return postelCode;
	}

	public void setPostelCode(String postelCode) {
		this.postelCode = postelCode;
	}

	public AddressDto(String hNo, String postelCode) {
		this.hNo = hNo;
		this.postelCode = postelCode;
	}

	public AddressDto() {
	}

	@Override
	public String toString() {
		return "AddressDto [hNo=" + hNo + ", postelCode=" + postelCode + "]";
	}
	
	

}
