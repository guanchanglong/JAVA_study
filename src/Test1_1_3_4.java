class A{
    public A(String title){     //父类提供的有参构造方法
        System.out.println("A类的构造方法"+title);
    }
}
class B extends A{//继承自A类
    public B(String title){
        super(title);   //明确调用父类构造，否则将出现编译错误
        System.out.println("B类的构造方法");
    }
}
public class Test1_1_3_4 {
    public static void main(String args[]){
        new B("!!!");   //实例化子类对象
    }
}
