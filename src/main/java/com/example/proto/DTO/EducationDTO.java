package com.example.proto.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EducationDTO extends W_UserDTO{
	  private String Edu_iD;
	  
	  private String Edu_name; 
	  
	  
		public EducationDTO(String email, String phoneNumber, String address, String password, String Edu_iD,
				String Edu_name) {
			super(email, phoneNumber, address, password);
			this.Edu_iD = Edu_iD;
			this.Edu_name = Edu_name;
		}

		public EducationDTO() {
			
		}

}
