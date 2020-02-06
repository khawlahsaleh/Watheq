package com.example.proto.mapperImp;


import org.modelmapper.ModelMapper;
import com.example.proto.DTO.EducationDTO;
import com.example.proto.mapper.EducationMapper;
import com.example.proto.model.Education;




public class EducationMapperImp implements EducationMapper {
	 private ModelMapper modelMapper;

		public EducationMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Education dtoToDomain(EducationDTO education) {
			return modelMapper.map(education,Education.class );

		}


		@Override
		public EducationDTO domainToDto(Education education) {
			return modelMapper.map(education,EducationDTO.class );

		}

	}
	