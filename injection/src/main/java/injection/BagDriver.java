package injection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BagDriver {

	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("core.xml");
		XmlBeanFactory bf = new XmlBeanFactory(cpr);

		Bag b = (Bag) bf.getBean("mybag");

		System.out.println(b.getBrand());
		System.out.println(b.getName());
		System.out.println(b.getB());

	}
}
