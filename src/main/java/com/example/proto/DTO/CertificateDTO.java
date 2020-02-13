package com.example.proto.DTO;

import java.sql.Timestamp;

import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CertificateDTO {
	private String cerId;
	
	private Individual national_id;


	private Education Edu_iD;

	
	private Education Edu_name;


	private String uniType;

	private String addBy;


	private Timestamp date_of_certificate;


	private Double GPA ;


	private String degree;


	private String major;

	public CertificateDTO() {
		super();
	}

	public CertificateDTO(String cerId, Individual national_id, Education Edu_iD, Education Edu_name, String uniType,
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
