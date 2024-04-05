package injection;

public class Bag {

	private String name;
	private String brand;
	Book b;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Bag [name=" + name + ", brand=" + brand + ", b=" + b + "]";
	}
	
	
}
