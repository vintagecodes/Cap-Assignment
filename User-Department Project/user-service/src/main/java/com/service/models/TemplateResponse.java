package com.service.models;

import com.service.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateResponse {
	
	private User user;
	private Department department;
	
	

}
