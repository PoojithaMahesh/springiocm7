package withoutbean;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("withoutbean.xml");
	Mobile mobile=applicationContext.getBean("mobile", Mobile.class);
	System.out.println(mobile);
}
}
