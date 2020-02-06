package com.example.proto.DTO;

import java.sql.Timestamp;


import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

public class ExperienceDTO {

	 private String Exp_id;
	 
 	 private Individual national_id;
    	 

 	 private Company CompanyName;
    	 

 	 private Education Edu_name;
    	 
    	
         private String ePosition;

         private Timestamp sDate;


         private Timestamp eDate;


         private String addBy;
         

         private String refName;
         
         private String refEmail;

			public String getePosition() {
				return ePosition;
			}
			public void setePosition(String ePosition) {
				this.ePosition = ePosition;
			}

			public Timestamp getsDate() {
				return sDate;
			}
			public void setsDate(Timestamp sDate) {
				this.sDate = sDate;
			}
			public Timestamp geteDate() {
				return eDate;
			}
			public void seteDate(Timestamp eDate) {
				this.eDate = eDate;
			}
			public String getAddBy() {
				return addBy;
			}
			public void setAddBy(String addBy) {
				this.addBy = addBy;
			}
			public String getRefName() {
				return refName;
			}
			public void setRefName(String refName) {
				this.refName = refName;
			}
			public String getRefEmail() {
				return refEmail;
			}
			public void setRefEmail(String refEmail) {
				this.refEmail = refEmail;
			}
			public Individual getNational_id() {
				return national_id;
			}
			public void setNational_id(Individual national_id) {
				this.national_id = national_id;
			}
			public Company getCompanyName() {
				return CompanyName;
			}
			public void setCompanyName(Company companyName) {
				CompanyName = companyName;
			}
			public Education getEdu_name() {
				return Edu_name;
			}
			public void setEdu_name(Education edu_name) {
				Edu_name = edu_name;
			}
			public String getExp_id() {
				return Exp_id;
			}
			public void setExp_id(String exp_id) {
				Exp_id = exp_id;
			}
			
}
