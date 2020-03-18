abstract class A8{
    public void fun(){
        this.print();
    }
        public abstract void print();
}
class X extends A8{
    public void print(){
        System.out.println("666");
    }
}
public class Test1_1_4_2 {
    public static void main(String args[]){
        A8 a=new X();
        a.fun();
    }
}
