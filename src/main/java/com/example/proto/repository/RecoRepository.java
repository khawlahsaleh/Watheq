package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Recommendation;
@Repository
@Transactional

public interface RecoRepository extends CrudRepository<Recommendation, Long>{
	@Modifying
	@Query("Update Recommendation recommendation SET recommendation.reco_from = :reco_from WHERE recommendation.reco_id = :reco_id ")
	void updateReco_from(@Param("reco_id") String reco_id, @Param("reco_from") String reco_from); 
	@Modifying
	@Query("Update Recommendation recommendation SET recommendation.reco_date = :reco_date WHERE recommendation.reco_id = :reco_id ")
	void updateReco_date(@Param("reco_id") String reco_id, @Param("reco_date") Timestamp reco_date); 
	@Modifying
	@Query("Update Recommendation recommendation SET recommendation.reco_attach = :reco_attach WHERE recommendation.reco_id = :reco_id ")
	void updateReco_attach(@Param("reco_id") String reco_id, @Param("reco_attach") String reco_attach); 
	@Modifying
	@Query("Update Recommendation recommendation SET recommendation.reco_institute_name = :reco_institute_name WHERE recommendation.reco_id = :reco_id ")
	void updateReco_institute_name(@Param("reco_id") String reco_id, @Param("reco_institute_name") String reco_institute_name); 

}

