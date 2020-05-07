package Project.Study.Map;

import java.util.HashMap;
import java.util.Map;

class Student{                      //此类为要保存的key类型
    private String name;            //只定义一个属性
    public Student(String name){    //构造方法接收数据
        this.name = name;
    }
    @Override
    public String toString(){
        return "学生姓名："+this.name;
    }
    @Override
    public int hashCode(){          //取得对象编码
        final int prime = 31;
        int result = 1;
        result = prime*result+((name==null)?0:name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){  //进行对象比较
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        if (name==null){
            if (other.name!=null){
                return false;
            }else if (!name.equals(other.name)){
                return false;
            }
        }
        return true;
    }
}
public class Test2 {
    public static void main(String[]args){
        Map<Student,Integer>map = new HashMap<>();              //实例化Map接口集合
        map.put(new Student("小泓"),100);                 //向Map接口保存数据
        System.out.println(map.get(new Student("小泓"))); //根据key取得value
    }
}
