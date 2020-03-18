interface A9{
    public abstract void print();
}
interface B9{
    public abstract void get();
}
abstract class C9{
    public abstract void change();
}
class X1 extends C9 implements A9,B9{
    public void print(){
        System.out.println("A接口的抽象方法");
    }
    public void get(){
        System.out.println("B接口的抽象方法");
    }
    public void change(){
        System.out.println("C类的抽象方法");
    }
}
public class Test1_1_4_3 {
    public static void main(String args[]){
        X1 x=new X1();
        A9 a=x;
        B9 b=x;
        C9 c=x;
        a.print();
        b.get();
        c.change();
    }
}
