package Project.Study.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[]args){
        List<String>all = new ArrayList<>();    //实例化集合对象
        //利用Collections类的方法向集合保存多个数据
        Collections.addAll(all,"Hello","World","!!!");
        Collections.reverse(all);               //集合反转
        System.out.println(all);                //直接输出集合对象
    }
}
