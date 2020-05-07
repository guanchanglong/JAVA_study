package Project.Study.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[]args){
        Map<String,Integer>map = new Hashtable<>();             //定义Map集合
        map.put("高数",98);                                       //保存数据
        map.put("离散",78);
        map.put("英语",87);
        map.put("英语",81);                                       //key数据重复
        //将Map集合变为Set集合，目的是使用iterator()方法，注意泛型的统一
        Set<Map.Entry<String,Integer>>set = map.entrySet();
        Iterator<Map.Entry<String,Integer>>iter = set.iterator();//取得Iterator实例
        while(iter.hasNext()){                                      //迭代输出
            Map.Entry<String,Integer>ma = iter.next();              //取出Map.Entry
            System.out.println(ma.getKey()+"="+ma.getValue());      //输出数据
        }
    }
}
