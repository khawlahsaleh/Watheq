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
@Builder
@Entity
@Table(name = "Certificate")
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Certificate implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@Column(name = "cerId", unique=true, nullable= false)
	private String cerId;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "national_id")//, nullable = false)
	private Individual national_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "Edu_iD")//, nullable = false)
	private Education Edu_iD;

	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "Edu_name")//, nullable = false)
	private Education Edu_name;


	@Column(name = "uniType", nullable= false)
	@NotNull(message = " the university type cannot be Empty ")
	private String uniType;

	@Column(name = "addBy", nullable= false)
	@NotNull(message = "Should insert who add the certificate ")
	private String addBy;

	@Column(name = "date_of_certificate", nullable= false)
	@NotNull(message = " the date of certificate cannot be Empty ")
	private Timestamp date_of_certificate;

	@Column(name = "GPA", nullable= false)
	@NotNull(message = " the GPA cannot be Empty ")
	private Double GPA ;

	@Column(name = "degree", nullable= false)
	@NotNull(message = " the degree cannot be Empty ")
	private String degree;

	@Column(name = "major", nullable= false)
	@NotNull(message = " the major cannot be Empty ")
	private String major;

	@Builder
	public Certificate( String cerId, String national_id, String Edu_iD, String Edu_name, String uniType,
			String addBy, Timestamp date_of_certificate, Double GPA, String degree, String major) {
		super();
		Education education=new Education(Edu_iD,Edu_name);
		this.national_id = new Individual("", "", "", "", "", "", "", national_id, "",
				"", "", null, "");
		this.cerId = cerId;
		this.Edu_iD =  education;
		this.Edu_name= education;
		this.uniType = uniType;
		this.addBy = addBy;
		this.date_of_certificate = date_of_certificate;
		this.GPA = GPA;
		this.degree = degree;
		this.major = major;
	}

	public Certificate(String uniType, String addBy, Timestamp date_of_certificate, Double GPA, String degree, String major) {
		super();
		this.uniType = uniType;
		this.addBy = addBy;
		this.date_of_certificate = date_of_certificate;
		this.GPA = GPA;
		this.degree = degree;
		this.major = major;
	}
}