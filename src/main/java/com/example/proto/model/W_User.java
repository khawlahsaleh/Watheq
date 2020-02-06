package com.example.proto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "W_user")
@MappedSuperclass
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class W_User implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="userId")
	public long userId;


	@Column(name = "email", nullable = false, unique=true)
	@Email(message = "email should be a valid email")
	@NotNull(message = " the email cannot be Empty ")
	private String email;

	@Column(name = "phoneNumber",nullable = false, unique=true)
	@NotNull(message = "the phone number cannot be Empty ")
	@Pattern(regexp = "(\\+966|0)[0-9]{9}")
	private String phoneNumber;

	@Column(name = "address",nullable = false)
	@NotNull(message = " the address cannot be Empty ")
	private String address;

	@Column(name = "password",nullable = false)
	@NotNull(message = " the password cannot be Empty ")
	private String password;

	public W_User( String email, String phoneNumber, String address, String password) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}//end User()

	@Override
	public String toString() {
		return "User [ , email=" + email + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", password=" + password + "]";
	}//end toString()

}//end class