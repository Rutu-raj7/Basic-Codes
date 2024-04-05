package injection;

public class Battery {
	
	private String name;
	private String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBran() {
		return brand;
	}
	public void setBran(String bran) {
		this.brand = bran;
	}
	@Override
	public String toString() {
		return "Battery [name=" + name + ", bran=" + brand + "]";
	}
	
	
	

}
