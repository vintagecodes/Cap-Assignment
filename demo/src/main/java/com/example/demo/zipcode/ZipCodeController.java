package com.example.demo.zipcode;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeController {
	
	@Autowired
	private ZipCodeService zipCodeService;
	
	@RequestMapping("/zipcodes")
	public List<ZipCode> getAllDetails(){
		return zipCodeService.getAllDetails();
	}
//	
	@RequestMapping("/zipcodes/{zipCode}")
	public ZipCode getZipCodeDetails(@PathVariable long zipCode ) {
		return zipCodeService.getZip(zipCode);
		
	}

}
