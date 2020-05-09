package Project.Study.Properties;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class Test2 {
    public static void main(String[]args)throws Exception{
        Properties properties = new Properties();           //实例化对象
        properties.setProperty("one","一");                  //保存属性信息
        properties.setProperty("two","二");
        properties.setProperty("three","三");
        //一般而言后缀可以随意设置，但是标准来讲，既然是文件，后缀就必须是*.properties，这样做是为了与国际化对应
        //在进行属性信息保存时如果属性内容为中文则会自动进行转码操作
        properties.store(new FileOutputStream(new File("d:"+File.separator+
                "Test"+File.separator+"test.properties")),"Area Info");
    }
}
