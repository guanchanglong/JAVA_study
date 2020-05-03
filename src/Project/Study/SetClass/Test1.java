package Project.Study.SetClass;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[]args){
        Set<String>all = new HashSet<>();   //实例化Set接口
        all.add("Hello");                   //保存数据
        all.add("World");
        all.add("!!!");
        all.add("!!!");                     //重复数据
        System.out.println(all);            //直接输出集合
    }
}
