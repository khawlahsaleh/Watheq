package com.example.proto.DTO;

import java.sql.Timestamp;

import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class W_UserDTO {
 public long userId;
	 
	  private String email;
	 

	  private String phoneNumber;
	 
	
	  private String address;
	 

	  private String password;


	public long getUser_id() {
		return userId;
	}

	public W_UserDTO( String email, String phoneNumber, String address, String password) {

		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}


	public W_UserDTO() {
		super();
	}


}
