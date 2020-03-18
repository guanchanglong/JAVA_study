interface A10{
    public void fun();
}
class B10 extends Object implements A10{
    public void fun(){
        System.out.println("666");
    }
    public String toString(){
        return "2333";
    }
}
public class Test1_1_4_8 {
    public static void main(String args[]){
        A10 a=new B10();
        Object obj=a;
        A10 t=(A10)obj;
        t.fun();
        System.out.println(t);
    }
}
