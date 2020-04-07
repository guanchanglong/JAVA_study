package Project.Study.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
    public static void main(String[]args) throws ParseException {
        String str="2013-8-15";
        String regex="\\d{4}-\\d{1,2}-\\d{1,2}";
        if(str.matches(regex)){
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(str);
            System.out.println(date);
        }
    }
}
