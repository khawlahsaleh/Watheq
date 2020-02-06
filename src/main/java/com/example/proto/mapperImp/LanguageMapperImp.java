package com.example.proto.mapperImp;


import org.modelmapper.ModelMapper;


import com.example.proto.DTO.LanguageDTO;
import com.example.proto.mapper.LanguageMapper;
import com.example.proto.model.Language;


public class LanguageMapperImp implements LanguageMapper {

	 private ModelMapper modelMapper;

		public LanguageMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Language dtoToDomain(LanguageDTO language) {
			return modelMapper.map(language,Language.class );

		}


		@Override
		public  LanguageDTO domainToDto(Language language) {
			return modelMapper.map(language,LanguageDTO.class );


		}

	}
	
