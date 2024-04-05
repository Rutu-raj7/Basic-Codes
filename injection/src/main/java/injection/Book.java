package injection;

public class Book {

	private String name;
	private String writer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + "]";
	}
	
/*	<bean id="mybook" class="injection.Book">
	<property name="name" value="chhava"> </property>
	<property name="writer" value="shivaji savant"></property>
	</bean>
	
	<property name="b" ref="mybook"></property>
	*/
}
