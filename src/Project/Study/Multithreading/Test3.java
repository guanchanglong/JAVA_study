package Project.Study.Multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<String>{
    private int ticket=10;
    @Override
    public String call() throws Exception{
        for(int x=0;x<100;x++){
            if(this.ticket>0){
                System.out.println("卖票，ticket="+this.ticket--);
            }
        }
        return "票已卖光！";
    }
}
public class Test3 {
    public static void main(String []args)throws Exception{
        MyThread3 mt1=new MyThread3();
        MyThread3 mt2=new MyThread3();
        FutureTask<String>task1=new FutureTask<>(mt1);
        FutureTask<String>task2=new FutureTask<>(mt2);
        //FutureTask是Runnable接口子类，所以可以使用Thread类的构造来接收task对象
        new Thread(task1).start();
        new Thread(task2).start();
        //多线程执行完毕后可以取得内容，依靠FutureTask的父接口Future中的get()方法实现
        System.out.println("A线程返回的结果："+task1.get());
        System.out.println("B线程返回的结果："+task2.get());
    }
}
