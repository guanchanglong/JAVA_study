package Project.Study.Reflect;

import java.lang.reflect.Field;

class Book5{
    private String title;
}
public class Test8 {
    public static void main(String[]args)throws Exception{
        Class<?>cls=Class.forName("Project.Study.Reflect.Book5");   //取得反射对象
        Object object=cls.newInstance();                            //必须给出实例化对象
        Field titleField=cls.getDeclaredField("title");     //取得类中的title属性
        titleField.setAccessible(true);                             //取消封装
        titleField.set(object,"Java书");                            //相当于：Book5类对象.title="数据"
        System.out.println(titleField.get(object));                 //相当于：Book5类对象.title
    }
}
