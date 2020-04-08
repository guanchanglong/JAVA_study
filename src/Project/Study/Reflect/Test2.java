package Project.Study.Reflect;

import java.util.Date;

public class Test2 {
    public static void main(String[]args){
        Date date=new Date();               //产生实例化对象
        Class<?>cls=date.getClass();        //通过实例化对象取得Class对象
        //Class类中定义有“public String getName()”方法可以取得类的完整名称
        System.out.println(cls.getName());  //直接输出对象所在类名称
    }
}
