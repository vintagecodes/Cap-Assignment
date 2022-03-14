package com.example.demo.users;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
	
//	private List<String> item = Arrays.asList("Burger","Pizza","fries");
//	private List<String> item1 = Arrays.asList("Coke","Pizza","Chicken");
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	
	
//	private List<Orders> orders = new ArrayList<>(Arrays.asList(
//			
//			new Orders(1,item,500.0),
//			new Orders(2,item1,2500.0)
//			
//			));
//	
	public List<Orders> getOrders(){
		return ordersRepository.findAll();
	}
	
	public Orders addOrders(Orders orders) {
		return ordersRepository.save(orders);
	}
	
	

}
