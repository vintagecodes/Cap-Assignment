package mongodbconnect.model;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "package") 
public class Orders {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private int id;
	private List<LineItem> items;
	private Customer customer;
	private float total;
	private Date date = new Date();
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, List<LineItem> items, Customer customer, float total, Date date) {
		super();
		this.id = id;
		this.setItems(items);
		this.customer = customer;
		this.total = total;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	

	

}
