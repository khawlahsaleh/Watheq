package com.example.proto.controller;



import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.CertificateDTO;
import com.example.proto.model.Education;
import com.example.proto.model.Individual;
import com.example.proto.service.CertificateService;




@RestController
public class CerController {
	 @Autowired
	//CerRepository Cerrepository ; 
	 CertificateService certificateService;
	 
	 Individual individual = new Individual("1022225065");
	 
	 Education education = new Education("7001","Saraw University1");
	 
	 CertificateDTO certificateDTO = new CertificateDTO("54f3",
			 individual,education,education,"G","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),66.5, "goof" , "IT");
	 
	 
	   @RequestMapping("/insertCertificate")
	   public String insertCertificate(){
		   
		  certificateService.createCertificateDTO(certificateDTO); 
		 //  Individual inn = new Individual(); 
		 //  Education edd= new Education();
		  // Cerrepository.save(new Certificate( 1094444, inn, edd ,  edd ,  "Gover","Qassim",null,4.65,"Good","IT"));
		  // Cerrepository.save(new Certificate("109490", "400","Qassim university", "Gover",
			//		"Qassim", Timestamp.valueOf("1983-07-12 21:30:55.888"),4.65, "Good" ,"IT" ));
		   
		   
		   
     return "Done for Company";
}
}
