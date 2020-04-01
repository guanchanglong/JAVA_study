package Project.Study.SimpleDateFormatClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[]args) throws ParseException {
        String str="2020-15-65 23:57:56.166";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date=sdf.parse(str);
        System.out.println(date);
    }
}
