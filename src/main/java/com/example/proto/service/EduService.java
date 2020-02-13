package com.example.proto.service;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.EducationDTO;
import com.example.proto.exception.NotFoundException;
import com.example.proto.mapperImp.EducationMapperImp;
import com.example.proto.model.Education;
import com.example.proto.repository.EduRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EduService {
	@Autowired
	private static final EducationMapperImp educationMapperImp = new EducationMapperImp();
	private EduRepository eduRepository; 


	public EducationDTO CreateEducationDTO ( EducationDTO educationDTO) {
		Education education = Education.builder()
				.email(educationDTO.getEmail())
				.phoneNumber(educationDTO.getPhoneNumber())
				.address(educationDTO.getAddress())
				.password(educationDTO.getPassword())
				.Edu_iD(educationDTO.getEdu_iD())
				.Edu_name(educationDTO.getEdu_name())
				.build();

		Education EduSave = eduRepository.save(education);
		return educationMapperImp.domainToDto(EduSave);

	}


	//Find Education
	public Education getById(String eduID) {
		try {
			return eduRepository.findById(eduID).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", eduID));
		}
	}


	//Deleting Education
	public void deleteEducation(String eduID) {
		Education existingEducation = getById(eduID);  
		eduRepository.deleteById(eduID);
		educationMapperImp.domainToDto(existingEducation); 
	}



	//Update Email for education 

		public EducationDTO updateEmaileducationDTO(String eduID , String email) {

			eduRepository.updateEmail(eduID, email);
			Education existingEducation = getById(eduID);
				return educationMapperImp.domainToDto(existingEducation); 
		}
		
		//Update PhoneNumber for education 

		public EducationDTO updatePhoneNumbereducationDTO(String eduID , String PhoneNumber) {
			eduRepository.updatePhoneNumber(eduID, PhoneNumber);
			Education existingEducation = getById(eduID);
				return educationMapperImp.domainToDto(existingEducation); 
		}
		
		
		//Update address for education 
		public EducationDTO updateAddresseducationDTO(String eduID , String address) {

			eduRepository.updateAddress(eduID, address);
			Education existingEducation = getById(eduID);  
				return educationMapperImp.domainToDto(existingEducation); 
		}
		
		//Update password for education 
		public EducationDTO updatePasswordeducationDTO(String eduID , String Pass) {

			eduRepository.updatePassword(eduID, Pass);
			Education existingEducation = getById(eduID);  
				return educationMapperImp.domainToDto(existingEducation);
		}
		
		
		//Update name for education 
		public EducationDTO updateNameeducationDTO(String eduID , String eduName) {

			eduRepository.updateEduName(eduID, eduName);
			Education existingEducation = getById(eduID);
				return educationMapperImp.domainToDto(existingEducation); 

		}
}
