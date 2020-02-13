package com.example.proto.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.CourseDTO;
import com.example.proto.DTO.RecommendationDTO;
import com.example.proto.model.Company;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;
import com.example.proto.service.CourseService;
import com.example.proto.service.RecommendationService;

@RestController
public class CourController {
	@Autowired
	//CouRepository Courepository; 

	CourseService courseService; 

	Individual individual = new Individual("1022225065");

	Education education = new Education("6001","Qa University");

	Company company = new Company("Elm1"); 


	CourseDTO courseDTO = new CourseDTO("cs200", individual , company ,education
			,"computerSince ", "DR.kk","yes",  Timestamp.valueOf("1983-07-12 21:30:55.888"), Timestamp.valueOf("1999-07-12 21:30:55.888"));

	
	
	
	
	@Autowired
	RecommendationService  recommendationService ; 
	RecommendationDTO  recommendationDTO = new  RecommendationDTO("A11","1022225065"
			, "El1m" , "Qa University1" , "DR.dd" , Timestamp.valueOf("1999-07-12 21:30:55.888") , "DRww" 
			, "yes" , "DR ll "); 

	
	
	@RequestMapping("/insertCourse")
	public String insertCourse(){

		courseService.createCourseDTO(courseDTO); 

		return "Done for Course";
	}
	
	
	@RequestMapping("/insertReco")
	public String insertReco(){

		recommendationService.createRecommendationDTO(recommendationDTO);

		return "Done for Reco";	
	}
}
