package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Company;

@Repository
@Transactional

public interface ComRepository extends CrudRepository<Company, String>{
	@Modifying
	@Query("Update Company company SET company.email = :email WHERE company.cr = :cr ")
	void updateEmail(@Param("cr") String cr, @Param("email") String email); 
	@Modifying
	@Query("Update Company company SET company.phoneNumber = :phoneNumber WHERE company.cr = :cr ")
	void updatePhoneNumber(@Param("cr") String cr, @Param("phoneNumber") String phoneNumber); 
	@Modifying
	@Query("Update Company company SET company.address = :address WHERE company.cr = :cr ")
	void updateAddress(@Param("cr") String cr, @Param("address") String address); 
	@Modifying
	@Query("Update Company company SET company.password = :password WHERE company.cr = :cr ")
	void updatePassword(@Param("cr") String cr, @Param("password") String password); 
	@Modifying
	@Query("Update Company company SET company.startDate = :startDate WHERE company.cr = :cr ")
	void updateStartDate(@Param("cr") String cr, @Param("startDate") Timestamp startDate); 
	@Modifying
	@Query("Update Company company SET company.endDate = :endDate WHERE company.cr = :cr ")
	void updateEndDate(@Param("cr") String cr, @Param("endDate") Timestamp endDate); 
}
