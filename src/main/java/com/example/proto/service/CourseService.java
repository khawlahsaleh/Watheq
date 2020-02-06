package com.example.proto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.proto.DTO.CourseDTO;

import com.example.proto.mapperImp.CourseMapperImp;

import com.example.proto.model.Course;

import com.example.proto.repository.CouRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {
	@Autowired
	CouRepository couRepository; 
	private static final CourseMapperImp CourseMapper = new CourseMapperImp();
	
	public CourseDTO createcompanyDTO(CourseDTO courseDTO) {
		Course course = Course.builder()
				.courseID(courseDTO.getCourseID())
				.national_id(courseDTO.getNational_id())
				.CompanyName(courseDTO.getCompanyName())
				.Edu_name(courseDTO.getEdu_name())
				.nameCourse(courseDTO.getNameCourse())
				.addedBy(courseDTO.getAddedBy())
				.courseAttch(courseDTO.getCourseAttch())
				.startDate(courseDTO.getStartDate())
				.endDate(courseDTO.getEndDate())
				.build();

		Course saveCourse = couRepository.save(course);
        return CourseMapper.domainToDto(saveCourse);
        
    }
	
}
