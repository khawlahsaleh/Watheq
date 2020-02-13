package com.example.proto.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CompanyDTO extends W_UserDTO{

	
	private String cr;

	private String companyName;


	private Timestamp startDate;


	private Timestamp endDate;


	public CompanyDTO(String email, String phoneNumber, String address, String password, String cr, String companyName,
			Timestamp startDate, Timestamp endDate) {
		super(email, phoneNumber, address, password);
		this.cr = cr;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public CompanyDTO() {
	
	}
	
	

}
