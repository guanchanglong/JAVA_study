class A4{
    public void print(){
        System.out.println("父类");
    }
}
class B4 extends A4{
    public void print(){
        System.out.println("子类");
    }
}
public class Test1_1_3_7 {
    public static void main(String args[]){
        A4 a=new B4();
        B4 b=(B4)a;
        b.print();
    }
}
