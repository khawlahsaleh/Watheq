package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Individual;
// Original Repository 
@Repository
@Transactional
public interface InRepository extends CrudRepository<Individual, String>{
  //  List<Individuals> findOne( long i_id);
  // List<Individual> findByLastName(String lastName);
	@Modifying
	@Query("Update Individual individual SET individual.email = :email WHERE individual.national_id = :national_id ")
	void updateEmail(@Param("national_id") String national_id, @Param("email") String email); 
	@Modifying
	@Query("Update Individual individual SET individual.phoneNumber = :phoneNumber WHERE individual.national_id = :national_id ")
	void updatePhoneNumber(@Param("national_id") String national_id, @Param("phoneNumber") String phoneNumber); 
	@Modifying
	@Query("Update Individual individual SET individual.address = :address WHERE individual.national_id = :national_id ")
	void updateAddress(@Param("national_id") String national_id, @Param("address") String address); 
	@Modifying
	@Query("Update Individual individual SET individual.password = :password WHERE individual.national_id = :national_id ")
	void updatePassword(@Param("national_id") String national_id, @Param("password") String password); 
	@Modifying
	@Query("Update Individual individual SET individual.status = :status WHERE individual.national_id = :national_id ")
	void updateStatus(@Param("national_id") String national_id, @Param("status") String status); 
	@Modifying
	@Query("Update Individual individual SET individual.skills = :skills WHERE individual.national_id = :national_id ")
	void updateSkills(@Param("national_id") String national_id, @Param("skills") String skills); 
	@Modifying
	@Query("Update Individual individual SET individual.attachments = :attachments WHERE individual.national_id = :national_id ")
	void updateAttachments(@Param("national_id") String national_id, @Param("attachments") String attachments); 
	@Modifying
	@Query("Update Individual individual SET individual.DOB = :DOB WHERE individual.national_id = :national_id ")
	void updateDOB(@Param("national_id") String national_id, @Param("DOB") Timestamp DOB); 
	
	
	

}
