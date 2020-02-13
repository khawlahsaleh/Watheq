package com.example.proto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proto.DTO.IndiDTO;
import com.example.proto.service.IndiService;

import java.sql.Timestamp;

@RestController
public class IndiController {
	@Autowired
//	InRepository Inrepository;
//	LanRepository Lanrepository;
	IndiService indiService;

	IndiDTO indiDTO = new IndiDTO("khawlas22al711@gmail.com","0541824338","Riyuadh52", "rawa","1022225065","khawla","saleh" ,"alorini","F" , "S", "game", Timestamp.valueOf("1996-05-16 00:00:00.000"),"Yes"); 
	@RequestMapping("/insertIndi")
	public String insert(){
		indiService.createIndividualDTO(indiDTO);


		//Inrepository.save(new Individual("khawla@gmail.com","053182","alqassim","98764lks", "khawlah","saleh","alorini" ,"109490","F" , "S", "game", Timestamp.valueOf("1996-05-15 00:00:00.000"),"Yes"));
		//Inrepository.save(new Individual("saleh@gmail.com","05366182","alqassim","98764lks", "khawlah","saleh","alorini" ,"198705","F" , "S", "game", Timestamp.valueOf("1996-05-15 00:00:00.000"),"Yes"));

		return "Done for Individual";
	}
//
//@RequestMapping("/updateIndiProcess")
//	public String update() {
//		Inrepository.updateStatus("109490", "s");
//		
//		return " Update done ";  
//	}
//
//
//	@RequestMapping("/findall")
//	public String findAll(){
//		String result = "<html>";
//
//		for(Individual Inte : Inrepository.findAll()){
//			result += "<div>" + Inte.toString() + "</div>";
//		}
//		for(Language Lang : Lanrepository.findAll()){
//			result += "<div>" + Lang.toString() + "</div>";
//		}
//
//		return result + "</html>";
//	}

	/*  @RequestMapping("/findbyid")
   public String findById(@RequestParam("i_id") long i_id){
       String result = "";
       result = repository.findOne(i_id).toString();
       return result;
   }

   @RequestMapping("/findbylastname")
   public String fetchDataByLastName(@RequestParam("lastname") String lastName){
       String result = "<html>";

       for(Individuals Int: repository.findByLastName(lastName)){
           result += "<div>" + Int.toString() + "</div>"; 
       }

       return result + "</html>";
   }*/
}