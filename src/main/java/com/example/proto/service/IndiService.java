package com.example.proto.service;

import java.sql.Timestamp;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.EducationDTO;
import com.example.proto.DTO.IndiDTO;
import com.example.proto.exception.NotFoundException;
import com.example.proto.mapperImp.IndividualMapperImp;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;
import com.example.proto.repository.InRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class IndiService {
	@Autowired
	InRepository inRepository;
	private static final IndividualMapperImp individualMapperImp = new IndividualMapperImp();

	public IndiDTO createIndividualDTO(IndiDTO individualDTO) {

		Individual individual = Individual.builder()
				.email(individualDTO.getEmail())
				.phoneNumber(individualDTO.getPhoneNumber())
				.address(individualDTO.getAddress())
				.password(individualDTO.getPassword())
				.national_id(individualDTO.getNational_id())
				.firstName(individualDTO.getFirstName())
				.mName(individualDTO.getMName())
				.lastName(individualDTO.getLastName())
				.gender(individualDTO.getGender())
				.status(individualDTO.getStatus())
				.skills(individualDTO.getSkills())
				.DOB(individualDTO.getDOB())
				.attachments(individualDTO.getAttachments())
				.build();

		Individual saveIndividual = inRepository.save(individual);
		return individualMapperImp.domainToDto(saveIndividual);

	}


	//Find individual
	public Individual getById(String ID) {
		try {
			return inRepository.findById(ID).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", ID));
		}
	}
	
	

	//Deleting Individual
	public void deleteIndividual(String ID) {
		Individual existingIndividual = getById(ID);  
		inRepository.deleteById(ID);
		individualMapperImp.domainToDto(existingIndividual); 
	}
	
	
	//Update Email for Individual 
	public IndiDTO updatePhoneNumberIndividualDTO(String ID , String PhoneNumber) {

		inRepository.updateEmail(ID, PhoneNumber);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	//Update Email for Individual 
	public IndiDTO updateEmailIndividualDTO(String ID , String email) {

		inRepository.updateEmail(ID, email);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	//Update password for Individual 
	public IndiDTO updatePasswordIndividualDTO(String ID , String password) {

		inRepository.updatePassword(ID, password);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	//Update status for Individual 
	public IndiDTO updateStatusIndividualDTO(String ID , String status) {

		inRepository.updateStatus(ID, status);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	
	
	//Update Skills for Individual 
	public IndiDTO updateSkillsIndividualDTO(String ID , String skills) {

		inRepository.updateSkills(ID, skills);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	
	
	//Update Attachments for Individual 
	public IndiDTO updateAttachmentsIndividualDTO(String ID , String attachments) {

		inRepository.updateAttachments(ID, attachments);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	
	
	//Update DOB for Individual 
	public IndiDTO updateDOBIndividualDTO(String ID , Timestamp DOB) {

		inRepository.updateDOB(ID, DOB);
		Individual existingEducation = getById(ID);
			return individualMapperImp.domainToDto(existingEducation); 
	}
	
	
	


}

