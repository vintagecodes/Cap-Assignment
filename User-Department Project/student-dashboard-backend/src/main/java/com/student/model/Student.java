package com.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private long rollNo;
	private String name;
	private String address;
	private double percentage;
	

}
