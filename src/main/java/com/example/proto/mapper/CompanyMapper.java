package com.example.proto.mapper;

import com.example.proto.DTO.CompanyDTO;
import com.example.proto.model.Company;


public interface CompanyMapper {
	Company dtoToDomain(final CompanyDTO company );

	CompanyDTO domainToDto(final Company company );
}
