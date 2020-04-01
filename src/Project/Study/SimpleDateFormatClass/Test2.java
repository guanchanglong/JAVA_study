package Project.Study.SimpleDateFormatClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[]args) throws ParseException {
        String str="2020-04-01 23:57:56.166";
        //实例化SimpleDateFormat类对象，同时定义好了要转换的字符串格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date=sdf.parse(str);
        System.out.println(date);
    }
}
