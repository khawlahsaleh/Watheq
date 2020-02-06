package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.CompanyDTO;
import com.example.proto.DTO.RecommendationDTO;
import com.example.proto.mapperImp.CompanyMapperImp;
import com.example.proto.mapperImp.RecommendationMapperImp;
import com.example.proto.model.Company;
import com.example.proto.model.Recommendation;
import com.example.proto.repository.ComRepository;
import com.example.proto.repository.RecoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RecommendationService {
	@Autowired
	RecoRepository recoRepository; 
	private static final RecommendationMapperImp RecommendationMapper = new RecommendationMapperImp();
	
	public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
		Recommendation recommendation = Recommendation.builder()
				.reco_id(recommendationDTO.getNational_id())
				.national_id(recommendationDTO.getNational_id())
				.CompanyName(recommendationDTO.getCompanyName())
				.Edu_name(recommendationDTO.getEdu_name())
				.reco_from(recommendationDTO.getReco_from())
				.reco_date(recommendationDTO.getReco_date())
				.reco_addby(recommendationDTO.getReco_addby())
				.reco_attach(recommendationDTO.getReco_attach())
				.reco_institute_name(recommendationDTO.getReco_institute_name())
				.build();

		Recommendation saveRecommendation = recoRepository.save(recommendation);
        return RecommendationMapper.domainToDto(saveRecommendation);
        
    }
	
}
