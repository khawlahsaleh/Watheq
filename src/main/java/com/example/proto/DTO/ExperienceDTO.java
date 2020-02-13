package com.example.proto.DTO;

import java.sql.Timestamp;



import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExperienceDTO {

	private String Exp_id;

	private String national_id;

	private String CompanyName;

	private String Edu_name;

	private String ePosition;

	private Timestamp sDate;

	private Timestamp eDate;

	private String addBy;

	private String refName;

	private String refEmail;

	public ExperienceDTO(String Exp_id, String national_id, String CompanyName, String Edu_name, String ePosition,
			Timestamp sDate, Timestamp eDate, String addBy, String refName, String refEmail) {
		super();
		this.Exp_id = Exp_id;
		this.national_id = national_id;
		this.CompanyName = CompanyName;
		this.Edu_name = Edu_name;
		this.ePosition = ePosition;
		this.sDate = sDate;
		this.eDate = eDate;
		this.addBy = addBy;
		this.refName = refName;
		this.refEmail = refEmail;
	}



}
