package Project.Study.Multithreading;

class MyThread9 implements Runnable{
    private boolean flag=true;
    public void run(){
        int i=0;
        while(this.flag){
            while(true){
                System.out.println(Thread.currentThread().getName()+"运行，i="+(i++));
            }
        }
    }
    public void stop(){
        this.flag=false;
    }
}
public class Test13 {
    public static void main(String []args){
        MyThread9 mt=new MyThread9();
        Thread t=new Thread(mt,"线程");
        t.start();
        mt.stop();
    }
}
