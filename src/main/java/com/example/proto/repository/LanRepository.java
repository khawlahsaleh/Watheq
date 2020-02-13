package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Language;
@Repository
@Transactional

public interface LanRepository extends CrudRepository<Language, String>{
//	@Modifying
//	@Query("Update Language language SET language.languge_id = :languge_id WHERE language.languge_id = :languge_id ")
//	void updateLanguge_id(@Param("languge_id") String languge_id);//, @Param("languge_id") String languge_id); 
	@Modifying
	@Query("Update Language language SET language.languge_name = :languge_name WHERE language.languge_id = :languge_id ")
	void updateLanguge_name(@Param("languge_id") String languge_id, @Param("languge_name") String languge_name); 
	@Modifying
	@Query("Update Language language SET language.add_by = :add_by WHERE language.languge_id = :languge_id ")
	void updateAdd_bye(@Param("languge_id") String languge_id, @Param("add_by") String add_by); 
	@Modifying
	@Query("Update Language language SET language.languge_date = :languge_date WHERE language.languge_id = :languge_id ")
	void updateLanguge_date(@Param("languge_id") String languge_id, @Param("languge_date") Timestamp languge_date); 
	@Modifying
	@Query("Update Language language SET language.duration_valid = :duration_valid WHERE language.languge_id = :languge_id ")
	void updateDuration_valid(@Param("languge_id") String languge_id, @Param("duration_valid") String duration_valid); 
	@Modifying
	@Query("Update Language language SET language.languge_attach = :languge_attach WHERE language.languge_id = :languge_id ")
	void updateUniType(@Param("languge_id") String languge_id, @Param("languge_attach") String languge_attach); 
}

