package Project.Study.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();    //实例化List集合接口
        all.add("Hello");                       //保存数据
        all.add("World");
        all.add("!!!");
        Stream<String>stream = all.stream();    //取得Stream类的对象
        System.out.println(stream.count());     //调用count()方法，取得数据的个数
    }
}
