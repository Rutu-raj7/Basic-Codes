package injection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {

	public static void main(String[] args) {
		
		ClassPathResource cpr=new ClassPathResource("core.xml");
		XmlBeanFactory bfact=new XmlBeanFactory(cpr);
		Mobile m=(Mobile) bfact.getBean("mymobile");
		
	
	  System.out.println(m);
	}
}

