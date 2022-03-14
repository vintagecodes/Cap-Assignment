package com.example.demo.creditcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping("/{cardName}/{number}")
	public String getDetails(@PathVariable String cardName, @PathVariable long number) {

		return creditCardService.creditValidation(cardName, number);
	}

}
