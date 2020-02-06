package com.example.proto.DTO;


public class EducationDTO extends W_UserDTO{
	  private String Edu_iD;
	  
	  private String Edu_name; 
	  
	  
	  public String getEdu_iD() {
			return Edu_iD;
		}

		public void setEdu_iD(String Edu_iD) {
			this.Edu_iD = Edu_iD;
		}


		public String getEdu_name() {
			return Edu_name;
		}

		public void setEdu_name(String Edu_name) {
			this.Edu_name = Edu_name;
		}

		public EducationDTO(String email, String phoneNumber, String address, String password, String Edu_iD,
				String Edu_name) {
			super(email, phoneNumber, address, password);
			this.Edu_iD = Edu_iD;
			this.Edu_name = Edu_name;
		}

		public EducationDTO() {
			
		}




}
