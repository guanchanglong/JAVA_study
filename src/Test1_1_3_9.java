class A6{
    public void print(){
        System.out.println("父类");
    }
}
class B6 extends A6{
    public void print(){    //覆写
        System.out.println("子类");
    }
    public void funB(){
        System.out.println("子类扩充的方法");
    }
}
public class Test1_1_3_9 {
    public static void main(String args[]){
        fun(new B6());  //对象向上转型
    }
    public static void fun(A6 a){
        a.print();
        if(a instanceof B6){    //如果a对象是B6类的实例
            B6 b=(B6)a; //向下转型
            b.funB();   //调用子类扩充的方法
        }
    }
}
//结果
//子类
//子类扩充的方法
