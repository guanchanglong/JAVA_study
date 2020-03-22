package Project.Study.Multithreading;
class MyTread4 implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());//使用currentThread()取得当前线程对象后再取得具体的线程名字
    }
}
public class Test4 {
    public static void main(String [] args) throws Exception{
        MyTread4 mt=new MyTread4();
        new Thread(mt,"自己的线程A").start();
        new Thread(mt).start();
        mt.run();
    }
}
