package Project.Study.Map.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Test1 {
    public static void main(String[]args){
        Map<String,Integer>map = new Hashtable<>(); //定义Map集合
        map.put("高数",100);
        map.put("离散",99);
        map.put("高数",88);
        map.put("离散",92);
        System.out.println(map.get("高数"));          //key存在返回value
        System.out.println(map.get("离散"));
        System.out.println(map.get("英语"));          //key不存在返回null
    }
}
