package Project.Study.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[]args){
        Map<String,Integer>map = new HashMap<>();   //定义Map集合
        map.put("高数成绩",89);                      //保存数据
        map.put("英语成绩",78);
        map.put("离散成绩",96);
        System.out.println(map.get("高数成绩"));    //key存在则返回value
        System.out.println(map.get("离散成绩"));
        System.out.println(map.get("英语成绩"));
        System.out.println(map.get("线代成绩"));    //key不存在则返回null
    }
}
