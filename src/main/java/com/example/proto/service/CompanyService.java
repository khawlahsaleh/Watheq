package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.CompanyDTO;
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
	
	public CompanyDTO createcompanyDTO(CompanyDTO companyDTO) {
		Company company = Company.builder()
				.email(companyDTO.getEmail())
				.phoneNumber(companyDTO.getPhone_number())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.cr(companyDTO.getCr())
				.companyname(companyDTO.getCompanyname())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())
				.build();

		Company savecompany = comRepository.save(company);
        return companyMapper.domainToDto(savecompany);
        
    }
	
	
	public CompanyDTO updateEmailcompanyDTO(String cr, String email) {
		Company company = Company.builder().cr(cr).email(email)
				.build();
		
	 comRepository.updateEmail(company.getCr(),company.getEmail());
       return companyMapper.domainToDto(company);
	}
	
	
	
	

}
