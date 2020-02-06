package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proto.DTO.IndiDTO;
import com.example.proto.mapperImp.IndividualMapperImp;
import com.example.proto.model.Individual;
import com.example.proto.repository.InRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class IndiService {
	@Autowired
	InRepository inRepository;
	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();
	
	public IndiDTO createIndividualDTO(IndiDTO individualDTO) {
		
		Individual individual = Individual.builder()
				.email(individualDTO.getEmail())
                .phoneNumber(individualDTO.getPhone_number())
                .address(individualDTO.getAddress())
                .password(individualDTO.getPassword())
                .national_id(individualDTO.getNational_id())
                .firstName(individualDTO.getFirstName())
                .mName(individualDTO.getMName())
                .lastName(individualDTO.getLastName())
                .gender(individualDTO.getGender())
                .status(individualDTO.getStatus())
                .skills(individualDTO.getSkills())
                .DOB(individualDTO.getDOB())
                .attachments(individualDTO.getAttachments())
                .build();

		Individual saveIndividual = inRepository.save(individual);
        return individualMapper.domainToDto(saveIndividual);
        
    }
}
