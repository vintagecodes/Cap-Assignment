package com.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private long userId;
	private String firstName;
	private String lastName;
	private String email;
	private long departmentId;

}
