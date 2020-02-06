package com.example.proto.mapperImp;


import org.modelmapper.ModelMapper;

import com.example.proto.DTO.CompanyDTO;
import com.example.proto.mapper.CompanyMapper;
import com.example.proto.model.Company;



public class CompanyMapperImp implements CompanyMapper{
	 private ModelMapper modelMapper;

		public CompanyMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Company dtoToDomain(CompanyDTO company) {
			return modelMapper.map(company,Company.class );

		}


		@Override
		public  CompanyDTO domainToDto(Company company) {
			return modelMapper.map(company,CompanyDTO.class );


		}

	}
	