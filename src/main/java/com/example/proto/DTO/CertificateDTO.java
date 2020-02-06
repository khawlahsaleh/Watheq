package com.example.proto.DTO;

import java.sql.Timestamp;


import com.example.proto.model.Education;
import com.example.proto.model.Individual;

public class CertificateDTO {
	private String cerId;
	
	private String national_id;


	private String Edu_iD;

	
	private String Edu_name;


	private String uniType;

	private String addBy;


	private Timestamp date_of_certificate;


	private Double GPA ;


	private String degree;


	private String major;

	public String getUni_type() {
		return uniType;
	}

	public void setUni_type(String uni_type) {
		this.uniType = uni_type;
	}

	public String getAddBy() {
		return addBy;
	}

	public void setAddBy(String addBy) {
		this.addBy = addBy;
	}

	public Timestamp getDoc() {
		return date_of_certificate;
	}

	public void setDoc(Timestamp date_of_certificate) {
		this.date_of_certificate = date_of_certificate;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double GPA) {
		this.GPA = GPA;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNational_id() {
		return national_id;
	}

	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}

	public String getEdu_iD() {
		return Edu_iD;
	}

	public void setEdu_iD(String Edu_iD) {
		this.Edu_iD = Edu_iD;
	}

	public String getEdu_name() {
		return Edu_name;
	}

	public void setEdu_name(String Edu_name) {
		this.Edu_name = Edu_name;
	}

	public String getCerId() {
		return cerId;
	}

	public void setCerId(String cerId) {
		this.cerId = cerId;
	}

	public CertificateDTO() {
		super();
	}

	public CertificateDTO(String cerId, String national_id, String Edu_iD, String Edu_name, String uniType,
			String addBy, Timestamp date_of_certificate, Double GPA, String degree, String major) {
		this.cerId = cerId;
		this.national_id = national_id;
		this.Edu_iD = Edu_iD;
		this.Edu_name = Edu_name;
		this.uniType = uniType;
		this.addBy = addBy;
		this.date_of_certificate = date_of_certificate;
		this.GPA = GPA;
		this.degree = degree;
		this.major = major;
	}
	
	


}
