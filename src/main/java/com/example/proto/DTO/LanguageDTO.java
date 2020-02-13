package com.example.proto.DTO;

import java.sql.Timestamp;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
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
