package com.example.proto.DTO;

import java.sql.Timestamp;


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
	  
	  public String getNational_id() {
			return national_id;
		}
		public void setNational_id(String National_id) {
			this.national_id = National_id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMName() {
			return mName;
		}
		public void setMName(String mName) {
			this.mName = mName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}
		public Timestamp getDOB() {
			return DOB;
		}
		public void setDOB(Timestamp dOB) {
			DOB = dOB;
		}
		public String getAttachments() {
			return attachments;
		}

		public void setAttachments(String attachments) {
			this.attachments = attachments;
		}
		public IndiDTO(String email, String phoneNumber, String address, String password, String national_id,
				String firstName, String mName, String lastName, String gender, String status, String skills,
				Timestamp dOB, String attachments) {
			super(email, phoneNumber, address, password);
			this.national_id = national_id;
			this.firstName = firstName;
			this.mName = mName;
			this.lastName = lastName;
			this.gender = gender;
			this.status = status;
			this.skills = skills;
			DOB = dOB;
			this.attachments = attachments;
		}
		public IndiDTO() {
			
		}
	  
}
