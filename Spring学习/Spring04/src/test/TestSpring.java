package test;

import com.Car1;
import com.CollectionBean;
import com.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    /**
     * ApplicationContext的三个常用实现类:
     * ClassPathXmLApplicationContext:它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。
     * FileSystemXmLApplicationContext:它可以加载磁盘任意路径下的配置文件(必须有访问权限)
     * AnnotationConfigApplicationContext:它是用于读取往解创建容器的。
     *
     * 核心容器的两个接口引发出的问题:
     * ApplicationContext:（单例对象适用）
     * 它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马， 上就创建配置文件中配置的对象。
     * BeanFactory:（多例对象适用）
     * 它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式(当要使用的时候再创建对象)。也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     */
    @Test
    public void demo3() {
        //1.获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据id获取Bean对象
        CollectionBean collectionBean = applicationContext.getBean(CollectionBean.class);

        System.out.println(collectionBean);
    }


    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car1 car1 = (Car1) applicationContext.getBean("car1_1");

        System.out.println(car1);
    }


    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee e = (Employee) applicationContext.getBean("employee2");

        System.out.println(e);
    }
}