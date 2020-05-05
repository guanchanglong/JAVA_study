package Project.Study.ListIteratorClass;

import java.util.Enumeration;
import java.util.Vector;

public class Test3 {
    public static void main(String[]args){
        Vector<String>all = new Vector<>();             //实例化Vector子类对象
        all.add("Hello");                               //向集合里面保存数据
        all.add("World");
        all.add("Hello");
        all.add("!!!");
        Enumeration<String> enu = all.elements();       //取得Enumeration接口对象
        while(enu.hasMoreElements()){                   //判断是否有数据
            String str = enu.nextElement();             //取出当前数据
            System.out.println(str);                    //输出数据
        }
    }
}
