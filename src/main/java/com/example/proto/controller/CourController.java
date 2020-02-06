package com.example.proto.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.CourseDTO;
import com.example.proto.model.Course;
import com.example.proto.repository.CouRepository;
import com.example.proto.service.CourseService;

@RestController
public class CourController {
	@Autowired
	//CouRepository Courepository; 
	
	CourseService courseService; 
	
	CourseDTO courseDTO = new CourseDTO("cs200", "109490" , "Elm" , "ilets"
				,"computerSince ", "DR.kk","yes",  Timestamp.valueOf("1983-07-12 21:30:55.888"), Timestamp.valueOf("1999-07-12 21:30:55.888"));
	
	@RequestMapping("/coursProcess")
	   public String process(){
		   
		courseService.createcompanyDTO(courseDTO); 
	//	Courepository.save(new Course("109490","khawlahCompany","Qassim","computer","Elm","yes",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
		  // Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
  
		
		
  return "Done for Course";
}

	   @RequestMapping("/updatecourse")
	   public String updateedu(){

		  // Courepository.updateNameCourse("CS1880", "sin");
	   

return "Done for Education";
}
}
