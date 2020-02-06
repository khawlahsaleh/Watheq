package com.example.proto.mapper;

import com.example.proto.DTO.CourseDTO;

import com.example.proto.model.Course;

public interface CourseMapper {
	Course dtoToDomain(final CourseDTO course );

	CourseDTO domainToDto(final Course course );
}
