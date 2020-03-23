package Project.Study.Multithreading;

class A{
    public synchronized void say(B b){
        System.out.println("A先生说：把你的笔记本给我，我给你笔，否则不给！");
        b.get();
    }
    public synchronized void get(){
        System.out.println("A先生：得到了笔记本，付出了笔，还是什么都干不了!");
    }
}
class B{
    public synchronized void say(A a){
        System.out.println("B先生说：把你的笔给我，我给你笔记本，否则不给！");
        a.get();
    }
    public synchronized void get(){
        System.out.println("B先生：得到了笔，付出了笔记本，还是什么都干不了");
    }
}
public class Test9 implements Runnable{
    private static A a=new A();                 //定义类对象
    private static B b=new B();
    public static void main(String[]args){
        new Test9();                            //实例化本类对象
    }
    public Test9(){                             //构造方法
        new Thread(this).start();        //启动线程
        b.say(a);                               //互相引用
    }
    @Override
    public void run(){
        a.say(b);                               //互相引用
    }
}
//结果：
//B先生说：把你的笔给我，我给你笔记本，否则不给！
//A先生说：把你的笔记本给我，我给你笔，否则不给！