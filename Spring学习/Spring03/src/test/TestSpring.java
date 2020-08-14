package test;

import com.Bean1;
import com.Bean2;
import com.Bean3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    //实例化工厂方法
    @Test
    public void demo3(){
        //加载配置文件 创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean3 bean3 = applicationContext.getBean(Bean3.class);
        System.out.println(bean3);

    }

    //静态工厂方法
    @Test
    public void demo2(){
        //加载配置文件 创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean2 bean2 = applicationContext.getBean(Bean2.class);
        System.out.println(bean2);

    }
    //构造方法得到bean对象
    @Test
    public void demo1(){
        //加载配置文件 创建工厂
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean1 bean1 = applicationContext.getBean(Bean1.class);
        applicationContext.close();
    }
}
//结果：这三个都得到类似于com.Bean1@7229c204 的内存地址
