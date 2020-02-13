package com.example.proto.DTO;

import java.sql.Timestamp;

import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {
	private String courseID;

	private Individual national_id;


	private Company CompanyName;


	private Education Edu_name;


	private String nameCourse;


	private String addedBy;


	private String courseAttch;


	private Timestamp startDate;


	private Timestamp endDate;

	public CourseDTO(String courseID, Individual national_id, Company CompanyName, Education Edu_name, String nameCourse,
			String addedBy, String courseAttch, Timestamp startDate, Timestamp endDate) {
		this.courseID = courseID;
		this.national_id = national_id;
		this.CompanyName = CompanyName;
		this.Edu_name = Edu_name;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.courseAttch = courseAttch;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	
	
}
