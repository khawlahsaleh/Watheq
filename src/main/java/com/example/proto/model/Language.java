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
@Table(name = "language")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Language implements Serializable  {
	private static final long serialVersionUID = -3009157732242241606L;
	
	 @Id
	  @Column(name = "languge_id", nullable= false, unique=true)
		private String languge_id;

   	 @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	 @JoinColumn(name = "national_id")//, nullable = false)
	 private Individual national_id;
   	 
   	 @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	 @JoinColumn(name = "CompanyName")//, nullable = false)
	 private Company CompanyName;
   	 
   	 @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	 @JoinColumn(name = "Edu_name")//, nullable = false)
	 private Education Edu_name;
   	 
	 
	  @Column(name = "languge_name", nullable= false)
	  @NotNull(message = "please specifie the kind of the languge ")
	  private String languge_name;
	 
	  @Column(name = "add_by", nullable= false)
	  @NotNull(message = " who add this certificate cannot be Empty ")
	  private String add_by;
	  
	  @Column(name = "languge_date", nullable= false)
	  @NotNull(message = " the passing date cannot be Empty ")
	  private Timestamp languge_date;
	  
	  
	  @Column(name = "duration_valid")
	  private String duration_valid;
	  
	  @Column(name = "languge_attach", nullable= false)
	  @NotNull(message = " the certivicate for the languge test cannot be Empty ")
	  private String languge_attach;
	  
	  
	 @Builder
	  public Language(String national_id, String CompanyName, String Edu_name, String languge_name, String add_by,
			Timestamp languge_date, String duration_valid, String languge_attach) {
		super();
		Education education=new Education(Edu_name);
		this.national_id = new Individual("", "", "", "", "", "", "", national_id, "",
				"", "", null, "");
		Company company=new Company(CompanyName);
		this.CompanyName = company;
		this.Edu_name = education;
		this.languge_name = languge_name;
		this.add_by = add_by;
		this.languge_date = languge_date;
		this.duration_valid = duration_valid;
		this.languge_attach = languge_attach;
	}




	public Language(String languge_name, String add_by, Timestamp languge_date,
			String duration_valid, String languge_attach) {
		super();
		this.languge_name = languge_name;
		this.add_by = add_by;
		this.languge_date = languge_date;
		this.duration_valid = duration_valid;
		this.languge_attach = languge_attach;
	}

	@Override
	  public String toString() {
	    return String.format("language[id=%d, languge_name=%s , Add_by=%s, languge_date='%s', "
	    		+ "duration_valid='%s', languge_attach='%s']", languge_id,languge_name, add_by, languge_date, duration_valid,languge_attach);
	  }
	
	
}
