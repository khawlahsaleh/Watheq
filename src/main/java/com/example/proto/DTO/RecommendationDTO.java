package com.example.proto.DTO;

import java.sql.Timestamp;

import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

public class RecommendationDTO {
	private String reco_id;
	
	private String national_id;
	 
	 private String CompanyName;
	 

	 private String Edu_name;
	 
	 

  private String reco_from;


  private Timestamp reco_date;
  


  private String reco_addby;

  private String reco_attach;
  

  private String reco_institute_name;
  

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


public String getReco_from() {
	return reco_from;
}


public void setReco_from(String reco_from) {
	this.reco_from = reco_from;
}


public Timestamp getReco_date() {
	return reco_date;
}


public void setReco_date(Timestamp reco_date) {
	this.reco_date = reco_date;
}


public String getReco_addby() {
	return reco_addby;
}


public void setReco_addby(String reco_addby) {
	this.reco_addby = reco_addby;
}


public String getReco_attach() {
	return reco_attach;
}


public void setReco_attach(String reco_attach) {
	this.reco_attach = reco_attach;
}


public String getReco_institute_name() {
	return reco_institute_name;
}


public void setReco_institute_name(String reco_institute_name) {
	this.reco_institute_name = reco_institute_name;
}


public String getReco_id() {
	return reco_id;
}


public void setReco_id(String reco_id) {
	this.reco_id = reco_id;
}


public RecommendationDTO(String reco_id, String national_id, String companyName, String edu_name, String reco_from,
		Timestamp reco_date, String reco_addby, String reco_attach, String reco_institute_name) {
	super();
	this.reco_id = reco_id;
	this.national_id = national_id;
	CompanyName = companyName;
	Edu_name = edu_name;
	this.reco_from = reco_from;
	this.reco_date = reco_date;
	this.reco_addby = reco_addby;
	this.reco_attach = reco_attach;
	this.reco_institute_name = reco_institute_name;
}




}
