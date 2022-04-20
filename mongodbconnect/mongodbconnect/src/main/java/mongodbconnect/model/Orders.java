package mongodbconnect.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "package")
public class Orders {
	
	private int id;
	private List<String> item;
	private String city;
	public Orders(int id, List<String> item, String city) {
		super();
		this.id = id;
		this.item = item;
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public List<String> getItem() {
		return item;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
