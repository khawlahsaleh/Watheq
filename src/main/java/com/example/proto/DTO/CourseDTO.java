package com.example.proto.DTO;

import java.sql.Timestamp;


public class CourseDTO {
	private String courseID;

	private String national_id;


	private String CompanyName;


	private String Edu_name;


	private String nameCourse;


	private String addedBy;


	private String courseAttch;


	private Timestamp startDate;


	private Timestamp endDate;



	public String getCourseAttch() {
		return courseAttch;
	}

	public void setCourseAttch(String courseAttch) {
		this.courseAttch = courseAttch;
	}


	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getNational_id() {
		return national_id;
	}

	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
	}

	public String getEdu_name() {
		return Edu_name;
	}

	public void setEdu_name(String Edu_name) {
		this.Edu_name = Edu_name;
	}

	public CourseDTO(String courseID, String national_id, String CompanyName, String Edu_name, String nameCourse,
			String addedBy, String courseAttch, Timestamp startDate, Timestamp endDate) {
		super();
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
