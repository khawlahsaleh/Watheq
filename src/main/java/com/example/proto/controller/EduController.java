package com.example.proto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.EducationDTO;
import com.example.proto.service.EduService;


@RestController
public class EduController {
	 @Autowired
	// EduRepository Edurepository; 
	 EduService eduService;

	 
		EducationDTO educationDTO = new EducationDTO("Qae@du.sa","+0977117","Qass777im11","272734","6001","Qa University1"); 
	   @RequestMapping("/eduProcess")

	   public String process(){

		 //  Edurepository.save(new Education("sa@edu.sa","+0966554433","qassim","43215","600","sa University"));
	   
   
   return "Done for Education";
}
	   @RequestMapping("/createedu")
	   public String createedu(){

		   eduService.CreateEducationDTO(educationDTO);
		   
		   return " Done" ; 

}
	   @RequestMapping("/updateedu")
	   public String updateedu(){
  
		 //  Edurepository.updateEduName("600", "Kh University");
		 //  Edurepository.updateEmail("600", "kkkk@gmail.com");
	   
   
   return "Done for Education";
}
}
