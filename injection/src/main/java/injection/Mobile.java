package injection;

public class Mobile {

	private int id;
	private String name;
	Battery b;
	
	
	
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
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
	
	
	
	
}
