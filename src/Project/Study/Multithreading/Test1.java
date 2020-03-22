package Project.Study.Multithreading;
import java.lang.Thread;

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for (int x=0;x<200;x++){
            System.out.println(this.name+"-->"+x);
        }
    }
}
public class Test1 {
    public static void main(String[] args){
        MyThread mt1=new MyThread("线程A");
        MyThread mt2=new MyThread("线程B");
        MyThread mt3=new MyThread("线程C");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
