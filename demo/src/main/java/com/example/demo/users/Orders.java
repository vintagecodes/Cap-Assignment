package com.example.demo.users;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Orders")
public class Orders {
	
	@Id
	private int orderId;
	private List<String> items;
	private double cost;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, List<String> items, double cost) {
		super();
		this.orderId = orderId;
		this.items = items;
		this.cost = cost;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
