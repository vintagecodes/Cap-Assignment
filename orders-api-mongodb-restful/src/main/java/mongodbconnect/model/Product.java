package mongodbconnect.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class Product {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	@Id
	private int id;
	private String name;
	private double cost;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
