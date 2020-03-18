class A5{
    public void print(){
        System.out.println("父类");
    }
}
class B5 extends A5{    //定义A5的子类
    public void print(){    //此时子类覆写了父类中的print()方法
        System.out.println("子类覆写的方法");
    }
    //在子类中扩充一个新的方法，但是此方法只能由子类对象调用，父类对象不能调用
    public void funB(){
        System.out.println("子类扩充的方法");
    }
}
public class Test1_1_3_8 {
    public static void main(String args[]){
        fun(new B5());  //向上转型，只能调用父类中定义的方法
    }
    public static void fun(A5 a){
        B5 b=(B5)a; //要调用的
        b.funB();
    }
}
