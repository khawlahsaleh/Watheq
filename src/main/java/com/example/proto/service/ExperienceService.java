package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.ExperienceDTO;
import com.example.proto.mapperImp.ExperienceMapperImp;
import com.example.proto.model.Experience;
import com.example.proto.repository.ExpRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExperienceService {
	@Autowired
	ExpRepository expRepository; 
	private static final ExperienceMapperImp experienceMapper = new ExperienceMapperImp();
	
	public ExperienceDTO createExperienceDTO(ExperienceDTO experienceDTO) {
		Experience experience = Experience.builder()
				.exp_id(experienceDTO.getExp_id())
				.national_id(experienceDTO.getNational_id())
				.CompanyName(experienceDTO.getCompanyName())
				.Edu_name(experienceDTO.getEdu_name())
				.ePosition(experienceDTO.getEPosition())
				.sDate(experienceDTO.getSDate())
				.eDate(experienceDTO.getEDate())
				.addBy(experienceDTO.getAddBy())
				.refName(experienceDTO.getRefName())
				.refEmail(experienceDTO.getRefEmail())
				.build();

		Experience saveExperience = expRepository.save(experience);
        return experienceMapper.domainToDto(saveExperience);
        
    }
	
}
