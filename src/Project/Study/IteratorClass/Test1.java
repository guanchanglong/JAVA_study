package Project.Study.IteratorClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();    //实例化List集合
        all.add("Hello");                       //保存数据
        all.add("Hello");                       //保存重复数据
        all.add("World");
        all.add("!!!");
        Iterator<String> iter = all.iterator(); //实例化Iterator接口
        while(iter.hasNext()){                  //判断当前是否还有数据
            String str = iter.next();           //取出当前数据
            System.out.println(str);            //输出数据
        }
    }
}
