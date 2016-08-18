package ys.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ys.spring.aop.test.Performer;
import ys.spring.aop.test.PerformerOne;

/**
 * Hello world!
 *
 */
public class App 
{


	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        PerformerOne p = context.getBean("performerOne",PerformerOne.class);
        Hello h = (Hello)context.getBean("hello");
        p.perform();
        p.say();
        h.say();
    }
}
