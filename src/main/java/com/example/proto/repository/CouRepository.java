package com.example.proto.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proto.model.Course;
@Repository
@Transactional

public interface CouRepository extends CrudRepository<Course, String>{
	@Modifying
	@Query("Update Course course SET course.nameCourse = :nameCourse WHERE course.courseID = :courseID ")
	void updateNameCourse(@Param("courseID") String courseID, @Param("nameCourse") String nameCourse); 
	@Modifying
	@Query("Update Course course SET course.addedBy = :addedBy WHERE course.courseID = :courseID ")
	void updateAddedBy(@Param("courseID") String courseID, @Param("addedBy") String addedBy); 
	@Modifying
	@Query("Update Course course SET course.courseAttch = :courseAttch WHERE course.courseID = :courseID ")
	void updateCourseAttch(@Param("courseID") String courseID, @Param("courseAttch") String courseAttch); 
	@Modifying
	@Query("Update Course course SET course.startDate = :startDate WHERE course.courseID = :courseID ")
	void updateStartDate(@Param("courseID") String courseID, @Param("startDate") Timestamp startDate); 
	@Modifying
	@Query("Update Course course SET course.endDate = :endDate WHERE course.courseID = :courseID ")
	void updateEndDate(@Param("courseID") String courseID, @Param("endDate") Timestamp endDate); 
}
