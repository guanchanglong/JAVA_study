package Project.Study.Reflect;

import java.lang.reflect.Method;

class Book4{
    private String title;
    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
}
public class Test7 {
    public static void main(String[]args)throws Exception{
        String fieldName="Title";
        Class<?>cls=Class.forName("Project.Study.Reflect.Book4");
        Object object=cls.newInstance();
        //取得类中的setTitle()方法
        Method setMet=cls.getMethod("set"+fieldName,String.class);
        //取得类中的getTitle()方法，本方法不接收参数并且没有返回值类型说明
        Method getMet=cls.getMethod("get"+fieldName);
        setMet.invoke(object,"Java书");      //等价于Book4类对象.setTitle("Java书");
        System.out.println(getMet.invoke(object));  //等价于Book4类对象.getTitle();
    }
}
