package com.example.aparchyDerbyDatabase.embeddeddatabase.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.aparchyDerbyDatabase.embeddeddatabase.model.User;

//to get the JPA method we use  repository
public interface  UserRepository extends CrudRepository<User, Integer>{

	User findByName(String name);
	//<modal , primary key  type>
}