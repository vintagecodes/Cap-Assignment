package mongodbconnect.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class Customer {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private int id;
	private String firstName;
	private String secondname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String secondname, String street, String city, String state, String zip,
			String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondname = secondname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
