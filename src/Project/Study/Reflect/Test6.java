package Project.Study.Reflect;

import java.lang.reflect.Constructor;

class Book3{
    private String title;
    private double price;
    public Book3(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString(){
        return "图书名称："+this.title+",价格："+this.price;
    }
}
public class Test6 {
    public static void main(String[]args)throws Exception{
        Class<?>cls=Class.forName("Project.Study.Reflect.Book3");
        //明确地找到Book3类中两个参数的构造，第一个参数类型是String，第二个是double
        Constructor<?>constructor=cls.getConstructor(String.class,double.class);
        Object object=constructor.newInstance("Java",79.9);     //实例化对象
        System.out.println(object);
    }
}
