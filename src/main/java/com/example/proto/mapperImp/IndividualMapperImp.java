package com.example.proto.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.proto.DTO.IndiDTO;
import com.example.proto.mapper.IndiMapper;
import com.example.proto.model.Individual;


public class IndividualMapperImp implements IndiMapper{


	 private ModelMapper modelMapper;

		public IndividualMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Individual dtoToDomain(IndiDTO individual) {
			return modelMapper.map(individual,Individual.class );

		}


		@Override
		public  IndiDTO domainToDto(Individual individual) {
			return modelMapper.map(individual,IndiDTO.class );


		}

	}
	
//	@Override
//	public Individual dtoToDomain(IndiDTO individual) {
//		
//		return mapperFacade.map(individual, Individual.class);
//	}
//	  
//	@Override
//	public IndiDTO domainToDto(Individual individual) {
//		return mapperFacade.map(individual, IndiDTO.class);
//
//	}
