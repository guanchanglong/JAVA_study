package Project.Study.LocaleClass;

import java.util.ResourceBundle;

public class Test2 {
    public static void main(String[]args){
        ResourceBundle resourceBundle=ResourceBundle.getBundle("Project.Study.LocaleClass.data1");//文件的存放地址
        System.out.println(resourceBundle.getString("hello"));//根据文件中定义的key取得对应的value数据
    }
}
