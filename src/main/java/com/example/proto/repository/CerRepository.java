package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Certificate;
@Repository
@Transactional
public interface CerRepository extends CrudRepository<Certificate, String>{
	@Modifying
	@Query("Update Certificate Certificate SET Certificate.uniType = :uniType WHERE Certificate.cerId = :cerId ")
	void updateUniType(@Param("cerId") String cerId, @Param("uniType") String uniType); 
	@Modifying
	@Query("Update Certificate Certificate SET Certificate.date_of_certificate = :date_of_certificate WHERE Certificate.cerId = :cerId ")
	void updateDateOfCertificate(@Param("cerId") String cerId, @Param("date_of_certificate") Timestamp date_of_certificate); 
	@Modifying
	@Query("Update Certificate Certificate SET Certificate.GPA = :GPA WHERE Certificate.cerId = :cerId ")
	void updateGPA(@Param("cerId") String cerId, @Param("GPA") Double GPA); 
	@Modifying
	@Query("Update Certificate Certificate SET Certificate.degree = :degree WHERE Certificate.cerId = :cerId ")
	void updateDegree(@Param("cerId") String cerId, @Param("degree") String degree); 
	@Modifying
	@Query("Update Certificate Certificate SET Certificate.major = :major WHERE Certificate.cerId = :cerId ")
	void updateMajor(@Param("cerId") String cerId, @Param("major") String major); 
	
	
}
