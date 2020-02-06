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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Experience")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Experience implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@Column(name = "Exp_id", nullable= false, unique=true)
	private String Exp_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "national_id")//, nullable = false)
	private Individual national_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "CompanyName")//, nullable = false)
	private Company CompanyName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "Edu_name")//, nullable = false)
	private Education Edu_name;


	@Column(name = "ePosition", nullable= false)
	private String ePosition;

	@Column(name = "sDate", nullable= false)
	private Timestamp sDate;

	@Column(name = "eDate", nullable= false)
	private Timestamp eDate;

	@Column(name = "addBy", nullable= false)
	private String addBy;

	@Column(name = "refName", nullable= false)
	private String refName;

	@Column(name = "refEmail", nullable= false)
	private String refEmail;
	
	
	@Builder
	public Experience(String exp_id, String national_id, String CompanyName, String Edu_name, String ePosition,
			Timestamp sDate, Timestamp eDate, String addBy, String refName, String refEmail) {

		Exp_id = exp_id;
		Education education=new Education(Edu_name);
		this.national_id = new Individual("", "", "", "", "", "", "", national_id, "",
				"", "", null, "");
		this.Edu_name= education;
		this.ePosition = ePosition;
		this.sDate = sDate;
		this.eDate = eDate;
		this.addBy = addBy;
		this.refName = refName;
		this.refEmail = refEmail;
	}

	
	public Experience( String Exp_id , String ePosition, Timestamp sDate, Timestamp eDate, String addBy,
			String refName, String refEmail) {
		super();
		this.Exp_id = Exp_id; 
		this.ePosition = ePosition;
		this.sDate = sDate;
		this.eDate = eDate;
		this.addBy = addBy;
		this.refName = refName;
		this.refEmail = refEmail;
	}


}
