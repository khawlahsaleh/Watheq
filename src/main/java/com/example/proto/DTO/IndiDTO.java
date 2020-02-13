package com.example.proto.DTO;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndiDTO extends W_UserDTO{

	private String national_id;


	private String firstName;


	private String mName;


	private String lastName;


	private String gender;


	private String status;


	private String skills;


	private  Timestamp DOB;

	private String attachments;


	public IndiDTO(String email, String phoneNumber, String address, String password, String national_id,
			String firstName, String mName, String lastName, String gender, String status, String skills,
			Timestamp DOB, String attachments) {
		super(email, phoneNumber, address, password);
		this.national_id = national_id;
		this.firstName = firstName;
		this.mName = mName;
		this.lastName = lastName;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.DOB = DOB;
		this.attachments = attachments;
	}
	public IndiDTO() {

	}

}
