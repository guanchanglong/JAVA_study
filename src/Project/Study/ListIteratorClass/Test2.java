package Project.Study.ListIteratorClass;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();            //实例化List接口对象
        all.add("Hello");                               //向集合里面保存数据
        all.add("World");
        all.add("Hello");
        all.add("!!!");
        //集合中包含的数据都是String型，所以需要使用String接收集合中的每一个数据
        for (String str:all
             ) {
            System.out.println(str);
        }
    }
}
