package Project.Study.ResourceBundleClass;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Test1 {
    public static void main(String[]args){
        //访问的时候不用加上后缀，因为默认找到的后缀就是“*.properties”
        ResourceBundle resourceBundle=ResourceBundle.getBundle("Project.Study.ResourceBundleClass.test1_data");
        System.out.println(MessageFormat.format(resourceBundle.getString("data"),"World","!!!"));//设置两个占位符的内容
    }
}
