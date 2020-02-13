package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.CertificateDTO;
import com.example.proto.mapperImp.CertificateMapperImp;
import com.example.proto.model.Certificate;
import com.example.proto.repository.CerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CertificateService {
	@Autowired
	CerRepository Cerrepository; 
	
	private static final CertificateMapperImp CertificateMapper = new CertificateMapperImp();
	
	public CertificateDTO createCertificateDTO(CertificateDTO certificateDTO) {
		Certificate certificate = Certificate.builder()
				.cerId(certificateDTO.getCerId())
				.national_id(certificateDTO.getNational_id())
				.Edu_iD(certificateDTO.getEdu_iD())
				.Edu_name(certificateDTO.getEdu_name())
				.uniType(certificateDTO.getUniType())
				.addBy(certificateDTO.getAddBy())
				.date_of_certificate(certificateDTO.getDate_of_certificate())
				.GPA(certificateDTO.getGPA())
				.degree(certificateDTO.getDegree())
				.major(certificateDTO.getMajor())
				.build();

		Certificate saveCertificate = Cerrepository.save(certificate);
        return CertificateMapper.domainToDto(saveCertificate);
        
    }
	
}
