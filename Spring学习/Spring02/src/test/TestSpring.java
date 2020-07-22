package test;

import com.Classes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Classes classes = (Classes)context.getBean(Classes.class);
        System.out.println(classes.toString());
    }
}
