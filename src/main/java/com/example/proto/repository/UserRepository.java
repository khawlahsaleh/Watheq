package com.example.proto.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.proto.model.W_User;

public interface UserRepository extends CrudRepository<W_User, Long>{

}