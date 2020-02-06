package com.example.proto.mapperImp;



import org.modelmapper.ModelMapper;

import com.example.proto.DTO.CourseDTO;
import com.example.proto.mapper.CourseMapper;
import com.example.proto.model.Course;


public class CourseMapperImp implements CourseMapper {
	 private ModelMapper modelMapper;

		public CourseMapperImp() {
			modelMapper = new ModelMapper();
		}

		@Override
		public  Course dtoToDomain(CourseDTO course) {
			return modelMapper.map(course,Course.class );

		}


		@Override
		public  CourseDTO domainToDto(Course course) {
			return modelMapper.map(course,CourseDTO.class );


		}

	}
	