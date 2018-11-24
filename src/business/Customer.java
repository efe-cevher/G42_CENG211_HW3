package business;

public class Customer {

	private String name;
	private int id;
	private CustomerType type;
	
	public Customer(String name, int id) {
		setName(name);
		setId(id);
		setType(CustomerType.REGULAR);
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getDiscountPercentge() {
		return type.getDiscount();
	}
	
	private void setName(String name) {
		this.name = name;
	}
	private void setId(int id) {
		this.id = id;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	
	
}
