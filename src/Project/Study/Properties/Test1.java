package Project.Study.Properties;

import java.util.Properties;

public class Test1 {
    public static void main(String[]args){
        Properties properties = new Properties();           //实例化类对象
        properties.setProperty("一","one");                  //保存属性信息
        properties.setProperty("二","two");
        properties.setProperty("三","three");
        System.out.println(properties.getProperty("一"));    //根据key取得属性信息
        System.out.println(properties.getProperty("二"));
        System.out.println(properties.getProperty("三"));
        System.out.println(properties.getProperty("四"));    //没有key返回默认值
    }
}
