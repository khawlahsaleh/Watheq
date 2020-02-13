package com.example.proto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


 
@Builder
@Getter
@Setter
@Entity
@Table(name = "Education")
@NoArgsConstructor
@AllArgsConstructor
public class Education extends W_User implements Serializable {
 
  private static final long serialVersionUID = -3009157732242241606L;

  @Id
  @Column(name = "Edu_iD",unique=true)
  @NotNull(message = " the Education id cannot be Empty ")

  private String Edu_iD;
 
  @Column(name = "Edu_name", unique=true)
  @NotNull(message = " the Education name cannot be Empty ")
  private String Edu_name; 
  


public Education(String Edu_name) {
	this.Edu_name = Edu_name;
}


@Builder
public Education( String email, String phoneNumber, String address, String password, String Edu_iD,
		String Edu_name) {
	super( email, phoneNumber, address, password);
	this.Edu_iD = Edu_iD;
	this.Edu_name = Edu_name;
}




}