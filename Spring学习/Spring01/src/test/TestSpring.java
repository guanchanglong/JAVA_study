package test;

import com.Source;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Source source = (Source) context.getBean(Source.class);
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());
        System.out.println(source.getIce());
    }
}

