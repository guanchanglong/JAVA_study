package Project.Study.DateClass;

import java.util.Date;

public class Test2 {
    public static void main(String[]args){
        long cur=System.currentTimeMillis();
        Date date=new Date(cur);
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
