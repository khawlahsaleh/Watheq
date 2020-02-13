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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Recommendation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recommendation implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	//Recommendation ID
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private String reco_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "national_id")//, nullable = false)
	private Individual national_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "CompanyName")//, nullable = false)
	private Company CompanyName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "Edu_name")//, nullable = false)
	private Education Edu_name;



	//Person who write it
	@Column(name = "Reco_From", nullable= false)
	@NotNull(message = " shouls specifi the recomendation source")
	private String reco_from;

	//Recommendation Creation date
	@Column(name = "Reco_Date", nullable= false)
	@NotNull(message = " the recomendation date cannot be Empty ")
	private Timestamp reco_date;

	//User Who added Recommendation 
	@Column(name = "Reco_AddBy", nullable= false)
	@NotNull(message = " who add this Recomendation cannot be Empty ")
	private String reco_addby;

	//URL Recommendation attachment
	@Column(name = "Reco_Attach", nullable= false)
	@NotNull(message = " thecannot be Empty ")
	private String reco_attach;

	//The name of the institute Who added Recommendation 
	@Column(name = "Reco_Institute_Name")
	private String reco_institute_name;

	@Builder
	public Recommendation( String national_id,String reco_id, String CompanyName, String Edu_name, String reco_from,
			Timestamp reco_date, String reco_addby, String reco_attach, String reco_institute_name) {
		super();
		Education education=new Education(Edu_name);
		this.national_id = new Individual(national_id);
		Company company=new Company(CompanyName);
		this.reco_id = reco_id;
		this.CompanyName = company;
		this.Edu_name = education;
		this.reco_from = reco_from;
		this.reco_date = reco_date;
		this.reco_addby = reco_addby;
		this.reco_attach = reco_attach;
		this.reco_institute_name = reco_institute_name;
	}


	public Recommendation(String reco_id, String reco_from, Timestamp reco_date, String reco_addby,
			String reco_attach, String reco_institute_name) {
		super();
		this.reco_id = reco_id;
		this.reco_from = reco_from;
		this.reco_date = reco_date;
		this.reco_addby = reco_addby;
		this.reco_attach = reco_attach;
		this.reco_institute_name = reco_institute_name;
	}

	@Override
	public String toString() {
		return "Recommendation [reco_id=" + reco_id + ", reco_from=" + reco_from
				+ ", reco_date=" + reco_date + ", reco_addby=" + reco_addby + ", reco_attach=" + reco_attach
				+ ", reco_institute_name=" + reco_institute_name + "]";
	}




}