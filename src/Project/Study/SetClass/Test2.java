package Project.Study.SetClass;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[]args){
        Set<String>all = new TreeSet<>();   //实例化Set接口
        Set<Integer>num = new TreeSet<>();
        all.add("b");                       //保存数据
        all.add("a");
        all.add("c");
        num.add(122);
        num.add(12);
        num.add(232);
        System.out.println(all);            //直接输出集合
        System.out.println(num);
    }
}
