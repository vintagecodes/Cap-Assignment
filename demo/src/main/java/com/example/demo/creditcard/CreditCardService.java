package com.example.demo.creditcard;

import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
	
	
	public String creditValidation(String cardName, long number) {
		String message = "";
		int length = String.valueOf(number).length();
		Long num = Long.valueOf(length);
		System.out.println(num);
		System.out.println(cardName);
		
		switch(cardName) {
		
		case "enRoute":
			if(num == 15) {
				String s = String.valueOf(number).substring(0, 4);
				long s1 = Long.parseLong(s);
				if(s1==2014 || s1 == 2149) {
					message = "Valid";
				}else {
					message = "InValid";
				}
			}else {
				message = "Length of Card should be 15";
			}
			break;
			
		case "JCB":
			if(num>=16 && num<=19) {
				String s = String.valueOf(number).substring(0, 4);
				long s1 = Long.parseLong(s);
				if(s1==3528 || s1 == 3589) {
					message = "Valid";
				}else {
					message = "InValid";
				}
			}else {
				message = "Length of Card should be between the range 16 to 19";
			}
			break;
			
		case "masterCard":
			if(num==16) {
				String s = String.valueOf(number).substring(0,1);
				String s2 = String.valueOf(number).substring(1,2);
				
				long s1 = Long.parseLong(s);
				long s3 = Long.parseLong(s2);
				if(s1 == 5 ) {
					if(s3>=1 && s3<=5) {
						message = "Valid";
					}else {
						message = "The second digits must be either between 1 to 5";
					}
					
				}
				else if(s1 == 2){
					if(s3>=2 && s3<=7) {
					message = "Valid";
				}else {
					message = "The second digits should be between 2 to 7";
				}
				
			}else {
				message = "InValid";
			}
			}else {
				message = "The length should be 16";
			}
			break;
			
		case "Visa":
			if(num == 14) {
				String s = String.valueOf(number).substring(0,1);
				long l1 = Long.parseLong(s);
				if(l1 == 4) {
					message = "Valid";
				}
				else {
					message = "InValid";
				}
			} else {
				message = "The length should be 14";
			}
			break;
		
			
		default:
			message = "Error Card Name";
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		}
		return message;
	}

}
