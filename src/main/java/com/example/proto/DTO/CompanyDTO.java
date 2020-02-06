package com.example.proto.DTO;

import java.sql.Timestamp;


public class CompanyDTO extends W_UserDTO{

	
	private String cr;

	private String companyname;


	private Timestamp startDate;


	private Timestamp endDate;




	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public CompanyDTO(String email, String phoneNumber, String address, String password, String cr, String companyname,
			Timestamp startDate, Timestamp endDate) {
		super(email, phoneNumber, address, password);
		this.cr = cr;
		this.companyname = companyname;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public CompanyDTO() {
	
	}
	
	

}
