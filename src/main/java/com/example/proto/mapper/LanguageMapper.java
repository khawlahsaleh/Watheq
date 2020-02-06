package com.example.proto.mapper;


import com.example.proto.DTO.LanguageDTO;
import com.example.proto.model.Language;

public interface LanguageMapper {
	Language dtoToDomain(final LanguageDTO language );

	LanguageDTO domainToDto(final Language language );
}
