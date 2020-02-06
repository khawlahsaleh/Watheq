package com.example.proto.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.proto.DTO.CertificateDTO;
import com.example.proto.mapper.CertificateMapper;
import com.example.proto.model.Certificate;




public class CertificateMapperImp implements CertificateMapper {
	 private ModelMapper modelMapper;

		public CertificateMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Certificate dtoToDomain(CertificateDTO certificate) {
			return modelMapper.map(certificate,Certificate.class );

		}


		@Override
		public  CertificateDTO domainToDto(Certificate certificate) {
			return modelMapper.map(certificate,CertificateDTO.class );


		}

	}
	