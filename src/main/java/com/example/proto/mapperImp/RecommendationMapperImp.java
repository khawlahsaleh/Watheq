package com.example.proto.mapperImp;



import org.modelmapper.ModelMapper;

import com.example.proto.DTO.RecommendationDTO;
import com.example.proto.mapper.RecommendationMapper;
import com.example.proto.model.Recommendation;


public class RecommendationMapperImp implements RecommendationMapper{
	 private ModelMapper modelMapper;

		public RecommendationMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Recommendation dtoToDomain(RecommendationDTO recommendation) {
			return modelMapper.map(recommendation,Recommendation.class );

		}


		@Override
		public  RecommendationDTO domainToDto(Recommendation recommendation) {
			return modelMapper.map(recommendation,RecommendationDTO.class );


		}

	}
	
