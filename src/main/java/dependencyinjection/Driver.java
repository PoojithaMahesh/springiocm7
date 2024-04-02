package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("dep.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Charger charger=(Charger) beanFactory.getBean("ch");
	System.out.println(charger);
	Mobile mobile=(Mobile)beanFactory.getBean("mobile");
	System.out.println(mobile);
}
}
