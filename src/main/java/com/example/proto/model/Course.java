package com.example.proto.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Entity
@Table(name = "course")
@NoArgsConstructor
@Getter
@Setter
public class Course implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//user_id
	@Id
	@Column(name = "courseID", unique=true)
	@NotNull(message = " the Course id  number for company cannot be Empty ")
	private String courseID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false , cascade=CascadeType.ALL)
	@JoinColumn(name = "national_id")//, nullable = false)
	private Individual national_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "CompanyName")//, nullable = false)
	private Company CompanyName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "Edu_name")//, nullable = false)
	private Education Edu_name;

	@Column(name = "nameCourse", nullable= false)
	private String nameCourse;

	@Column(name = "addedBy", nullable= false)
	private String addedBy;

	@Column(name = "courseAttch", nullable= false)
	private String courseAttch;

	@Column(name = "startDate", nullable= false)
	private Timestamp startDate;

	@Column(name = "endDate", nullable= false)
	private Timestamp endDate;

	@Builder
	public Course(String courseID,Individual national_id, Company CompanyName, Education Edu_name, String nameCourse,
			String addedBy, String courseAttch, Timestamp startDate, Timestamp endDate) {
		// Individual individual = Individual.builder().national_id(individual.getNational_id()).build();
		//Company company = Company.builder().companyname(company.getCompanyname()).build();
		//this.national_id = individual()
		
		this.courseID = courseID;
//		Education education=new Education(Edu_name);
//		this.national_id = new Individual( national_id);
//		Company company=new Company(CompanyName);
		this.national_id= national_id;
		this.CompanyName = CompanyName;
		this.Edu_name = Edu_name;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.courseAttch = courseAttch;
		this.startDate = startDate;
		this.endDate = endDate;
	}




}