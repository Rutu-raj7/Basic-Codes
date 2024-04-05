package injection;

public class Car {

	private int id;
	private String name;
	Engine engine;
	
	
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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}
	
	
	
	
}
