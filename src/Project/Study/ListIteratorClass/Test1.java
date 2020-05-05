package Project.Study.ListIteratorClass;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();            //实例化List接口对象
        all.add("Hello");                               //向集合里面保存数据
        all.add("World");
        all.add("Hello");
        all.add("!!!");
        System.out.println("由前向后输出：");
        ListIterator<String>iter = all.listIterator();  //实例化ListIterator接口
        while(iter.hasNext()){                          //由前向后迭代
            String str = iter.next();                   //取出当前数据
            System.out.print(str+"、");               //输出数据
        }
        System.out.println("\n由后向前输出：");
        while(iter.hasPrevious()){                      //由后向前迭代
            String str = iter.previous();
            System.out.print(str+"、");
        }
    }
}
