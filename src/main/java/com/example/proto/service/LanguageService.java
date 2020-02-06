package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.proto.DTO.LanguageDTO;

import com.example.proto.mapperImp.LanguageMapperImp;

import com.example.proto.model.Language;

import com.example.proto.repository.LanRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageService {
	@Autowired
	LanRepository lanRepository; 
	private static final LanguageMapperImp LanguageMapper = new LanguageMapperImp();
	
	public LanguageDTO createLanguageDTO(LanguageDTO languageDTO) {
		Language language = Language.builder()
				.national_id(languageDTO.getNational_id())
				.CompanyName(languageDTO.getCompanyName())
				.Edu_name(languageDTO.getEdu_name())
				.languge_name(languageDTO.getLanguge_name())
				.add_by(languageDTO.getAdd_by())
				.languge_date(languageDTO.getLanguge_date())
				.duration_valid(languageDTO.getDuration_valid())
				.languge_attach(languageDTO.getLanguge_attach())
				.build();

		Language saveLanguage = lanRepository.save(language);
        return LanguageMapper.domainToDto(saveLanguage);
        
    }
	
}
