package Project.Study.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[]args){
        //使用了泛型，从而保证集合中所有的数据类型都一致
        List<String>all = new ArrayList<>();        //实例化List集合
        System.out.println("长度：" + all.size() + ",是否为空："+all.isEmpty());
        all.add("Hello");                           //保存数据
        all.add("Hello");                           //保存重复数据
        all.add("World");
        System.out.println("长度："+all.size()+",是否为空："+all.isEmpty());
        //Collection接口定义size()方法取得了集合长度，List子接口扩充get()方法根据索引取得了数据
        for (String str : all) {                    //取得索引数据
            System.out.println(str);                //直接输出内容
        }
    }
}
