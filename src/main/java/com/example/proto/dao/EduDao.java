package com.example.proto.dao;

import java.util.List;

import com.example.proto.model.Education;

public interface EduDao {
	 public void creat(Education education);
	 public void update(Education education);
	 public Education edit(String eduId);
	 public void delete(String eduId);
	 public Education find(String eduId);
	 public List<Education> getAll(); 
	 
}
