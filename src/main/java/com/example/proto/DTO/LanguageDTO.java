package com.example.proto.DTO;

import java.sql.Timestamp;


import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

public class LanguageDTO {
	private String languge_id;
	
	private String national_id;
  	 
	 private String CompanyName;
  	 

	 private String Edu_name;
  	 

	  private String languge_name;
	 

	  private String add_by;
	  

	  private Timestamp languge_date;
	  
	  
	  private String duration_valid;
	  

	  private String languge_attach;
	  
	  
	  
	  
	  
	public String getNational_id() {
		return national_id;
	}

	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getEdu_name() {
		return Edu_name;
	}

	public void setEdu_name(String edu_name) {
		Edu_name = edu_name;
	}

	public String getLanguge_name() {
		return languge_name;
	}

	public void setLanguge_name(String languge_name) {
		this.languge_name = languge_name;
	}

	public String getAdd_by() {
		return add_by;
	}

	public void setAdd_by(String add_by) {
		this.add_by = add_by;
	}

	public Timestamp getLanguge_date() {
		return languge_date;
	}

	public void setLanguge_date(Timestamp languge_date) {
		this.languge_date = languge_date;
	}
	

	public String getLanguge_id() {
		return languge_id;
	}

	public void setLanguge_id(String languge_id) {
		this.languge_id = languge_id;
	}

	public String getDuration_valid() {
		return duration_valid;
	}

	public void setDuration_valid(String duration_valid) {
		this.duration_valid = duration_valid;
	}

	public String getLanguge_attach() {
		return languge_attach;
	}

	public void setLanguge_attach(String languge_attach) {
		this.languge_attach = languge_attach;
	}

	public LanguageDTO(String national_id, String CompanyName, String Edu_name, String languge_name, String add_by,
			Timestamp languge_date, String duration_valid, String languge_attach) {
		super();
		this.national_id = national_id;
		this.CompanyName = CompanyName;
		this.Edu_name = Edu_name;
		this.languge_name = languge_name;
		this.add_by = add_by;
		this.languge_date = languge_date;
		this.duration_valid = duration_valid;
		this.languge_attach = languge_attach;
	}
	
	
	
}
