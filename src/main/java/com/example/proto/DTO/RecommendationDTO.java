package com.example.proto.DTO;

import java.sql.Timestamp;


import lombok.Getter;
import lombok.Setter;



@Getter
@Setter


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



	public RecommendationDTO(String reco_id, String national_id, String CompanyName, String Edu_name, String reco_from,
			Timestamp reco_date, String reco_addby, String reco_attach, String reco_institute_name) {
		super();
		this.reco_id = reco_id;
		this.national_id = national_id;
		this.CompanyName = CompanyName;
		this.Edu_name = Edu_name;
		this.reco_from = reco_from;
		this.reco_date = reco_date;
		this.reco_addby = reco_addby;
		this.reco_attach = reco_attach;
		this.reco_institute_name = reco_institute_name;
	}




}
