package Project.Study.Multithreading;

class MyThread5 implements Runnable{
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            try {
                Thread.sleep(1000);     //每次执行休眠1s
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",x="+x);
        }
    }
}
public class Test5 {
    public static void main(String []args){
        MyThread5 mt1=new MyThread5();
        MyThread5 mt2=new MyThread5();
        MyThread5 mt3=new MyThread5();
        new Thread(mt1,"自己的线程对象A").start();
        new Thread(mt2,"自己的线程对象B").start();
        new Thread(mt3,"自己的线程对象C").start();
    }
}
