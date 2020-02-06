package com.example.proto.mapper;

import com.example.proto.DTO.EducationDTO;
import com.example.proto.model.Education;


public interface EducationMapper {
	Education dtoToDomain(final EducationDTO education );

	EducationDTO domainToDto(final Education education );
}
