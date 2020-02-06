package com.example.proto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.EducationDTO;
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
	Education education = Education.builder().email(educationDTO.getEmail()).phoneNumber(educationDTO.getPhone_number()).address(educationDTO.getAddress())
			.password(educationDTO.getPassword()).Edu_iD(educationDTO.getEdu_iD()).Edu_name(educationDTO.getEdu_name()).build();

	Education EduSave = eduRepository.save(education);
    return educationMapperImp.domainToDto(EduSave);
	
}
}
