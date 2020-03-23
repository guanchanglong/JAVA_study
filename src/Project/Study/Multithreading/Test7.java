package Project.Study.Multithreading;

class MyThread7 implements Runnable{
    private int ticket=10;
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            synchronized(this){
                if(this.ticket>0){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+",卖票，ticket="+this.ticket--);
                }
            }
        }
    }

}
public class Test7 {
    public static void main(String [] args){
        MyThread7 mt=new MyThread7();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
        new Thread(mt,"票贩子D").start();
    }
}
