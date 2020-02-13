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

	 
		EducationDTO educationDTO = new EducationDTO("Saraw@du.sa","0536281746","Riyadh","272734","701","rw University1"); 
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
  
		   eduService.updateAddresseducationDTO("7001", "Qassim");
		 //  eduService.deleteEducation("7001");
	   
   
   return "Education updated";
}
	   
	   @RequestMapping("/deleteedu")
	   public String deleteEdu(){

		  eduService.deleteEducation("7001");
	   
   
   return " Education deleted";
}
}
