package Project.Study.Multithreading;

class MyThread6 implements Runnable{
    @Override
    public void run(){
        for(int x=0;x<20;x++){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",x="+x);
        }
    }
}
public class Test6 {
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getPriority());
    }
}
