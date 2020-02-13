package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Experience;
@Repository
@Transactional

public interface ExpRepository extends CrudRepository<Experience, String>{
	@Modifying
	@Query("Update Experience Experience SET Experience.ePosition = :ePosition WHERE Experience.Exp_id = :Exp_id ")
	void updateEPosition(@Param("Exp_id") String Exp_id, @Param("ePosition") String ePosition); 
	@Modifying
	@Query("Update Experience Experience SET Experience.sDate = :sDate WHERE Experience.Exp_id = :Exp_id ")
	void updateSDate(@Param("Exp_id") String Exp_id, @Param("sDate") Timestamp sDate); 
	@Modifying
	@Query("Update Experience Experience SET Experience.eDate = :eDate WHERE Experience.Exp_id = :Exp_id ")
	void updateEDate(@Param("Exp_id") String Exp_id, @Param("eDate") Timestamp eDate); 
	@Modifying
	@Query("Update Experience Experience SET Experience.addBy = :addBy WHERE Experience.Exp_id = :Exp_id ")
	void updateAddBy(@Param("Exp_id") String Exp_id, @Param("addBy") String addBy); 
	@Modifying
	@Query("Update Experience Experience SET Experience.refName = :refName WHERE Experience.Exp_id = :Exp_id ")
	void updateRefName(@Param("Exp_id") String Exp_id, @Param("refName") String refName); 
	@Modifying
	@Query("Update Experience Experience SET Experience.refEmail = :refEmail WHERE Experience.Exp_id = :Exp_id ")
	void updateRefEmail(@Param("Exp_id") String Exp_id, @Param("refEmail") String refEmail); 
}
