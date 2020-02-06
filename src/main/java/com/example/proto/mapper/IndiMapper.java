package com.example.proto.mapper;


import com.example.proto.DTO.IndiDTO;
import com.example.proto.model.Individual;



public interface IndiMapper {


	Individual dtoToDomain(final IndiDTO individual );

	IndiDTO domainToDto(final Individual individual );





}


