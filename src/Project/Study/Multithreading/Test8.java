package Project.Study.Multithreading;

class MyThread8 implements Runnable{
    private int ticket=10;          //一共有10张票
    @Override
    public void run(){
        for (int x=0;x<20;x++){
            this.sale();            //卖票操作
        }
    }
    public synchronized void sale(){//同步方法
        if (this.ticket>0){         //判断当前是否还有剩余票
            try{
                Thread.sleep(100);//休眠1s，模拟延迟
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",卖票,ticket="+this.ticket--);
        }
    }
}
public class Test8 {
    public static void main(String []args){
        MyThread8 mt=new MyThread8();
        new Thread(mt,"票贩子A").start();//启动多线程
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
        new Thread(mt,"票贩子D").start();
    }
}
//结果：
//票贩子A,卖票,ticket=10
//票贩子A,卖票,ticket=9
//票贩子A,卖票,ticket=8
//票贩子A,卖票,ticket=7
//票贩子A,卖票,ticket=6
//票贩子A,卖票,ticket=5
//票贩子A,卖票,ticket=4
//票贩子A,卖票,ticket=3
//票贩子A,卖票,ticket=2
//票贩子A,卖票,ticket=1