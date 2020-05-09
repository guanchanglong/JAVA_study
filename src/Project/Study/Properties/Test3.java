package Project.Study.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Test3 {
    public static void main(String[]args)throws Exception{
        Properties properties = new Properties();           //实例化对象
        properties.load(new FileInputStream(new File("d:"+File.separator+
                "Test"+File.separator+"test.properties")));
        System.out.println(properties.getProperty("一"));    //根据key取得属性信息
        System.out.println(properties.getProperty("two"));
        System.out.println(properties.getProperty("three"));
    }
}
