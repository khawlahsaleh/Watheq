package com.example.proto.mapper;


import com.example.proto.DTO.ExperienceDTO;
import com.example.proto.model.Experience;

public interface ExperienceMapper {
	
	Experience dtoToDomain(final ExperienceDTO experience );

	ExperienceDTO domainToDto(final Experience experience );
}
