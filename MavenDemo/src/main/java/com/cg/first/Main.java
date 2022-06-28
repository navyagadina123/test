package com.cg.first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        context =new ClassPathXmlApplicationContext("beans.xml");
//        HelloBean hellobean=(HelloBean) context.getBean("HelloBean");
//        hellobean.sayHello();
        
        
        Resource r=new ClassPathResource("beans.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Employee s=(Employee)factory.getBean("e");  
        s.show();  
          
        Employee s1=(Employee)factory.getBean("e1");  
        s1.show();  
        
        Employee s2=(Employee)factory.getBean("e2");  
        s2.show();  
        
        Employee s3=(Employee)factory.getBean("e3");  
        s3.show();  
	}

}
