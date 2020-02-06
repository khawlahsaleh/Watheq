package com.example.proto.mapper;

import com.example.proto.DTO.CertificateDTO;

import com.example.proto.model.Certificate;



public interface CertificateMapper {
	Certificate dtoToDomain(final CertificateDTO certificate );

	CertificateDTO domainToDto(final Certificate certificate );
	
}
