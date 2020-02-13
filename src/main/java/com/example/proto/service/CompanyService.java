package com.example.proto.service;

import java.sql.Timestamp;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.CompanyDTO;
import com.example.proto.exception.NotFoundException;
import com.example.proto.mapperImp.CompanyMapperImp;
import com.example.proto.model.Company;
import com.example.proto.repository.ComRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyService {
	@Autowired
	ComRepository comRepository; 
	private static final CompanyMapperImp companyMapper = new CompanyMapperImp();


	// create company 
	public CompanyDTO createcompanyDTO(CompanyDTO companyDTO) {
		Company company = Company.builder()
				.email(companyDTO.getEmail())
				.phoneNumber(companyDTO.getPhoneNumber())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.cr(companyDTO.getCr())
				.companyName(companyDTO.getCompanyName())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())
				.build();

		Company savecompany = comRepository.save(company);
		return companyMapper.domainToDto(savecompany);
	}



	//Find Company
	public Company getById(String cr) {
		try {
			return comRepository.findById(cr).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}


	//Deleting company
	public void deleteCompany(String cr) {
		try {
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();
			comRepository.deleteById(cr);
			companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}


	//Update Email Company 

	public CompanyDTO updateEmailcompanyDTO(String cr , String email) {
		try {
			comRepository.updateEmail(cr, email);	
			Company existingCompany = getById(cr); 
			//Company existingCompany = comRepository.findById(cr).get();

			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}

	}

	//Update Phone Number Company
	public CompanyDTO updatePhoneNumbercompanyDTO(String cr , String PhoneNumber) {
		try {
			comRepository.updatePhoneNumber(cr, PhoneNumber);
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();
			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}


	//Update Address for Company

	public CompanyDTO updateAddresscompanyDTO(String cr , String address) {
		try {
			comRepository.updateAddress(cr, address);
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();
			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}

	}


	//Update Password for Company
	public CompanyDTO updatePasswordcompanyDTO(String cr , String pass) {
		try {
			comRepository.updatePassword(cr, pass);
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();
			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}

	}

	//Update CR start date for Company


	public CompanyDTO updateStartDatecompanyDTO(String cr , Timestamp startDate) {
		try {
			comRepository.updateStartDate(cr, startDate);
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();
			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}


	//Update CR end date for Company
	public CompanyDTO updateEndDatecompanyDTO(String cr , Timestamp endDate) {
		try {
			comRepository.updateEndDate(cr, endDate);
			Company existingCompany = getById(cr);  
			//Company existingCompany = comRepository.findById(cr).get();

			return companyMapper.domainToDto(existingCompany); 
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", cr));
		}
	}

}
