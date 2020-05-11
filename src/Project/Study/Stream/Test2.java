package Project.Study.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();    //实例化List集合接口
        all.add("Hello");                       //保存数据
        all.add("World");
        all.add("!!!");
        all.add("Hello");
        all.add("hello");
        all.add("world");
        all.add("World");
        all.add("!!");
        Stream<String>stream = all.stream();    //取得Stream类的对象
        //去掉重复数据后形成新的List集合数据，里面不包含重复内容的集合
        List<String>newAll = stream.distinct().collect(Collectors.toList());
        newAll.forEach(System.out::println);    //取得消除重复数据后的内容
    }
}
