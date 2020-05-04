package Project.Study.SetClass;

import java.util.HashSet;
import java.util.Set;

class Student{
    private String name;
    private double score;
    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(score);
        result = prime*result+(int)(temp^(temp>>>32));
        result = prime*result+((name==null)?0:name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        Student other = (Student)obj;
        if (Double.doubleToLongBits(score)!=Double.doubleToLongBits(other.score)){
            return false;
        }
        if (name==null){
            if (other.name!=null){
                return false;
            }
        }else if (!name.equals(other.name)){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "学生姓名："+this.name+",成绩："+this.score+"\n";
    }
}
public class Test4 {
    public static void main(String[]args){
        Set<Student>all = new HashSet<>();                  //实例化Set接口
        all.add(new Student("小明",88));      //保存数据
        all.add(new Student("小黄",87.2));
        all.add(new Student("小黄",87.5));    //部分重复
        all.add(new Student("小黄",87.2));    //全部重复
        all.add(new Student("小欢",88));
        System.out.println(all);
    }
}
