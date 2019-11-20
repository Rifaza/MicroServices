package com.example.aparchyDerbyDatabase.embeddeddatabase.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// this will connect with database
@Entity(name="USER_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
	@Id
	private int id;
	private String name;
	private String[] address;

}
