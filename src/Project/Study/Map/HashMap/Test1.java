package Project.Study.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[]args){
        Map<String,Integer>map = new HashMap<>();   //定义Map集合
        map.put("One",1);                           //保存数据
        map.put("一",1);
        map.put("一",2);                             //key数据重复
        map.put("一一",11);
        map.put(null,0);                            //key为null
        map.put("空",null);                          //value数据为null
        System.out.println(map);                    //输出全部map集合
    }
}
