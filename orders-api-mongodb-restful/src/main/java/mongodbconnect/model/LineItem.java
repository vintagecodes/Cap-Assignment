package mongodbconnect.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class LineItem {
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	@Id
	private int id;
	private int quantity;
	private Product product;
	
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineItem(int id, int quantity, Product product) {
		super();

		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		System.out.println(product);
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	



	

}
