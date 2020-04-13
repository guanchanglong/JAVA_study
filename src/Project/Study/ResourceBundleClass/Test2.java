package Project.Study.ResourceBundleClass;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test2 {
    public static void main(String[]args){
        Locale zhLoc=new Locale("zh","CN");//中国——中文
        Locale enLoc=new Locale("en","US");//英语——美国
        ResourceBundle zhRB=ResourceBundle.getBundle("Project.Study.ResourceBundleClass.Message",zhLoc);//读取中文资源文件
        ResourceBundle enRB=ResourceBundle.getBundle("Project.Study.ResourceBundleClass.Message",enLoc);//读取英文资源文件
        //读取资源内容
        System.out.println(MessageFormat.format(zhRB.getString("data"),"World"));
        System.out.println(MessageFormat.format(enRB.getString("data"),"World","!!!"));
    }
}
