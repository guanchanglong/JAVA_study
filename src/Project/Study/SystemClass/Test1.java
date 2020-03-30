package Project.Study.SystemClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[]args){
        long start=System.currentTimeMillis();
        String str="";
        for(int x=0;x<30000;x++){
            str+=x;
        }
        long end=System.currentTimeMillis();    //currentTimeMillis()返回以毫秒为单位的当前时间
        System.out.println("开始时间："+start);
        SimpleDateFormat start1 = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date1 = new Date(start);
        System.out.println(start1.format(date1));
        System.out.println("结束时间："+end);
        SimpleDateFormat end2 = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date2 = new Date(end);
        System.out.println(end2.format(date2));
        System.out.println("本次操作所花费的时间："+(end-start));
    }
}
