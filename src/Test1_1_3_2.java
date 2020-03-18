class Book13{
    public Book13(){
        System.out.println("[A]Book13构造方法");
    }
    {   //将代码写在类里，所以为构造块
        System.out.println("[B]Book13类中的构造块");
    }
    static {    //定义静态块
        System.out.println("[C]Book13类中的静态块");
    }
}
public class Test1_1_3_2 {
    public static  void main(String args[]){
        System.out.println("Hello World");
    }
    static {
        System.out.println("He");
    }
}
//结果
//[C]Book13类中的静态块
//[B]Book13类中的构造块
//[A]Book13构造方法
//[B]Book13类中的构造块
//[A]Book13构造方法