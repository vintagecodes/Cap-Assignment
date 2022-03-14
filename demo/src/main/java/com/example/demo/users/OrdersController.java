package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders(){
		return ordersService.getOrders();
	}
	
	@PostMapping("/addOrders")
	public Orders addOrders(@RequestBody Orders orders) {
		return ordersService.addOrders(orders);
	}

}
