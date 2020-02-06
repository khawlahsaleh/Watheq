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
	 
	 
	 CompanyDTO companyDTO = new CompanyDTO("Elm1@sa.sa","011222233","riyadh113","123334","67346337634254","El1m",Timestamp.valueOf("1983-07-12 21:30:55.888"),
			 Timestamp.valueOf("1983-07-12 21:30:55.888"));
	 
	 
	   @RequestMapping("/insertCompany")
	   public String process(){
		   companyService.createcompanyDTO(companyDTO); 
		 //  Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
		  // Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
     
     return "Done for Company";
}
	   
	   @RequestMapping("/updateEmailCompany")
	   public String updateEmail(){
		   companyService.updateEmailcompanyDTO("673467634254", "Elm55@elm.sa");
		 //  Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
		  // Comrepository.save(new Company("Elm@elm.sa","0112233","riyadh","1234","673467634254","Elm",Timestamp.valueOf("1983-07-12 21:30:55.888"),Timestamp.valueOf("1983-07-12 21:30:55.888")));
     
     return "Done for Company";
}
	   
	   
	   
//
//		@RequestMapping("/findallCom")
//		public String findAll(){
//			String result = "<html>";
//
//			for(Company Inte : Comrepository.findAll()){
//				result += "<div>" + Inte.toString() + "</div>";
//			}
//			for(Language Lang : Lanrepository.findAll()){
//				result += "<div>" + Lang.toString() + "</div>";
//			}
//
//			return result + "</html>";
//		}
}