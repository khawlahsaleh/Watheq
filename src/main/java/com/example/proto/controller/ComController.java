package com.example.proto.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.CompanyDTO;
import com.example.proto.model.Company;
import com.example.proto.service.CompanyService;


@RestController
public class ComController {
	 @Autowired
//	 ComRepository Comrepository; 
//	 LanRepository Lanrepository;
//	 
	 CompanyService companyService; 
	 Company company = new Company();
	 
	 
	 CompanyDTO companyDTO = new CompanyDTO("Elm21@sa.sa","0531884338","riyadh113","123334","47446337634254","Ell1m",Timestamp.valueOf("1983-07-12 21:30:55.888"),
			 Timestamp.valueOf("1983-07-12 21:30:55.888"));
	 
	 
	   @RequestMapping("/insertCompany")
	   public String process(){
		   companyService.createcompanyDTO(companyDTO); 
		 //  Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
		  // Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
     
     return "Done for Company";
}
	   
	   @RequestMapping("/updateEmailCompany")
	   public CompanyDTO updateEmail(){
		 return  companyService.updateEmailcompanyDTO("47446337634254", "Ellm77@elm.sa");
		 
    // return companyDTO;
}
	   @RequestMapping("/findCompany")
	   public String find(){
		 companyService.getById("47446337634254"); 
     return "Done for Company";
}
	   
	   @RequestMapping("/deleteCompany")
	   public String  deleteCompany(){
		   companyService.deleteCompany("47446337634254"); 
		   
     return "Done for Company";
}
}