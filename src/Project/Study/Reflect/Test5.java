package Project.Study.Reflect;

class Book{
    public Book(){
        System.out.println("该类的无参方法");
    }
    @Override
    public String toString(){
        return "Hello World";
    }
}
public class Test5 {
    public static void main(String[]args) throws Exception {
        Class<?>cls=Class.forName("Project.Study.Reflect.Book");//设置要操作对象的类名称
        //反射实例化后的对象返回的结果都是Object类型
        Object object=cls.newInstance();                        //相当于使用new调用无参结构
        Book book=(Book)object;                                 //向下转型
        System.out.println(book);
    }
}
