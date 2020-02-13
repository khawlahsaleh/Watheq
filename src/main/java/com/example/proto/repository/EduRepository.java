package com.example.proto.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Education;


@Repository
@Transactional
public interface EduRepository extends CrudRepository<Education, String>{
	@Modifying
	@Query("Update Education education SET education.email = :email WHERE education.Edu_iD = :Edu_iD ")
	void updateEmail(@Param("Edu_iD") String Edu_iD, @Param("email") String email); 
	@Modifying
	@Query("Update Education education SET education.phoneNumber = :phoneNumber WHERE education.Edu_iD = :Edu_iD ")
	void updatePhoneNumber(@Param("Edu_iD") String Edu_iD, @Param("phoneNumber") String phoneNumber); 
	@Modifying
	@Query("Update Education education SET education.address = :address WHERE education.Edu_iD = :Edu_iD ")
	void updateAddress(@Param("Edu_iD") String Edu_iD, @Param("address") String address); 
	@Modifying
	@Query("Update Education education SET education.password = :password WHERE education.Edu_iD = :Edu_iD ")
	void updatePassword(@Param("Edu_iD") String Edu_iD, @Param("password") String password); 
	@Modifying
	@Query("Update Education education SET education.Edu_name = :Edu_name WHERE education.Edu_iD = :Edu_iD ")
	void updateEduName(@Param("Edu_iD") String Edu_iD, @Param("Edu_name") String Edu_name); 
}
