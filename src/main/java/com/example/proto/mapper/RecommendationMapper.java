package com.example.proto.mapper;


import com.example.proto.DTO.RecommendationDTO;
import com.example.proto.model.Recommendation;

public interface RecommendationMapper {
	Recommendation dtoToDomain(final RecommendationDTO recommendation );

	RecommendationDTO domainToDto(final Recommendation recommendation );
}
