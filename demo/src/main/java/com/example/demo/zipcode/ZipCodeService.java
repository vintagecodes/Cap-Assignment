package com.example.demo.zipcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeService {
	
	private List<ZipCode> topics = new ArrayList<>(Arrays.asList(
			new ZipCode(721304,"West Bengal","Kolkata","India"),
			new ZipCode(721306,"Kerala","Kanchipuram","India"),
			new ZipCode(721300,"Malala","Madhya Pardesh","India")
			));

	
	public List<ZipCode> getAllDetails(){
		return topics;
	}
	
	public ZipCode getZip(long zipCode){
		return topics.stream().filter(t->t.getZipCode()==zipCode).findFirst().get();
	}
}
