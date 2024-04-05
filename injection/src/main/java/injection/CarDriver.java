package injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {

	public static void main(String[] args) {
		
		ClassPathResource cpr=new ClassPathResource("core.xml");
	XmlBeanFactory bf= new XmlBeanFactory(cpr);
	
	Car c=(Car) bf.getBean("my");

	System.out.println(c.getEngine());
	
//	System.out.println(c.getName());
	
	
		
		
	}
}
