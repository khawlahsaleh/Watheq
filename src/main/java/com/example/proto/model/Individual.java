package com.example.proto.model;



import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Table(name = "Individual")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Individual extends W_User implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "national_id" , unique=true, nullable= false )
	//@NotNull(message = " the national id cannot be Empty ")
	//@Size(min = 10, max = 10, message = "National id must be 10 numbers")
	private String national_id;

	@Column(name = "firstname")
	//@NotNull(message = " the first name cannot be Empty ")
	@Size(min = 3, max = 60)
	private String firstName;

	@Column(name = "mName")
	//@NotNull(message = " the middle name cannot be Empty ")
	@Size(min = 3, max = 60)
	private String mName;

	@Column(name = "lastname")
	//@NotNull(message = " the last name cannot be Empty ")
	@Size(min = 3, max = 60)
	private String lastName;

	@Column(name = "gender")
	//@NotNull(message = " the gender cannot be Empty ")
	private String gender;

	@Column(name = "status")
	//@NotNull(message = " the status cannot be Empty ")
	private String status;

	@Column(name = "skills")
	private String skills;

	@Column(name = "DOB")
	//@NotNull(message = " the Date Of Birt cannot be Empty ")
	@Past
	private  Timestamp DOB;

	@Column(name = "attachments")
	private String attachments;


	@Builder
	public Individual(String email, String phoneNumber, String address, String password, String national_id, String firstName, String mName, String lastName, String gender,
			String status, String skills, Timestamp DOB, String attachments) {
		super(email, phoneNumber, address, password);
		this.firstName = firstName;
		this.mName = mName;
		this.lastName = lastName;
		this.national_id = national_id;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.DOB = DOB;
		this.attachments = attachments;
	}

	public Individual( String national_id) {
		this.national_id= national_id; 
	}
	@Builder
	public Individual(String firstName, String mName, String lastName, String gender, String status, String skills,
			Timestamp DOB, String attachments) {
		this.firstName = firstName;
		this.mName = mName;
		this.lastName = lastName;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.DOB = DOB;
		this.attachments = attachments;
	}

}