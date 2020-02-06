package com.example.proto.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Entity
@Table(name = "Company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company extends W_User implements Serializable  {

	private static final long serialVersionUID = -3009157732242241606L;
	//@Id
	@Column(name = "cr", unique=true, nullable= false)
	@NotNull(message = " the CR number for company cannot be Empty ")
	private String cr;

	// Name of company
	@Column(name = "companyName", unique=true, nullable = false)
	@NotNull(message = " the company name cannot be Empty ")
	private String companyname;

	
	// cr starting Date
	@Column(name = "startDate", nullable = true)
	@NotNull(message = " the CR start date cannot be Empty ")
	private Timestamp startDate;
	
	// cr ending date
	@Column(name = "endDate", nullable = true)
	@NotNull(message = " the CR end date cannot be Empty ")
	@Past // the end date of the CR should not be expire . 
	private Timestamp endDate;
	
	
	

	@Builder
	public Company(String email, String phoneNumber, String address, String password, String cr, String companyname,
			Timestamp startDate, Timestamp endDate) {
		super(email, phoneNumber, address, password);
		this.cr = cr;
		this.companyname = companyname;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

	public Company(String companyname) {
		this.companyname = companyname;
	}
	
	@Override
	public String toString() {
		return "Company [cr=" + cr + ", companyname=" + companyname + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}






}