package Project.Study.SimpleDateFormatClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[]args){
        Date date=new Date();           //实例化Date类对象
        //实例化SimpleDateFormat类对象，同时定义好要转换的目标字符串格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str=sdf.format(date);    //将Date型变为String型
        System.out.println(str);
    }
}
