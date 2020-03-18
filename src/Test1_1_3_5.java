class A1{
    public void fun(){  //在父类定义的方法
        System.out.println("A类中的fun()方法");
    }
}
class B1 extends A1{    //定义子类，此时没有覆写任何方法
    public void fun(){  //此处为覆写
        System.out.println("B类中的fun()方法");
    }
}
class C1 extends A1{
    public void fun(){  //此处为覆写
        System.out.println("C类中的fun()方法");
    }
}
public class Test1_1_3_5 {
    public static void main(String args[]){
        B1 b=new B1();  //实例化子类对象
        b.fun();    //调用fun()方法，此时方法被覆写，所以调用被覆写过的方法
        C1 c=new C1();
        c.fun();
    }
}
//结果：
//B类中的fun()方法
//C类中的fun()方法
