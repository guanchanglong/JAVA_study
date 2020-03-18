abstract class A7{  //定义一个抽象类
    public void fun(){  //普通方法
        System.out.println("存在方法体的方法");
    }
    //抽象方法
    public abstract void print();
}
//一个子类只能继承一个抽象类，属于单继承局限
class B7 extends A7{
    public void print(){    //抽象类的子类，而且是一个普通类
        System.out.println("666");  //强制要求覆写的方法
    }
}
public class Test1_1_4_1 {
    public static void main(String args[]){
        A7 a=new B7();  //向上转型
        a.print();  //被子类覆写过的方法
        a.fun();
    }
}
//结果
//666
//存在方法体的方法
