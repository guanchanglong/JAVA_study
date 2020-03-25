package Project.Study.Multithreading;

class Message3{
    private String title;
    private String content;
    private boolean flag=true;
    //flag==true:表示可以生产，但是不能拿走
    //flag==false:表示可以取走，但是不能生产
    public synchronized void set(String title,String content){
        if(this.flag==false){
            try {
                super.wait();                   //等待
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.title=title;
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;                        //已经生产完成，修改标志位
        super.notify();                         //唤醒等待线程
    }
    public synchronized void get(){
        if (this.flag==true){                   //未生产，不能取走
            try {
                super.wait();                   //等待
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
        this.flag=true;                         //已经取走了，可以继续生产
        super.notify();                         //唤醒等待线程
    }
}
class Producer3 implements Runnable{
    private Message3 meg;
    public Producer3(Message3 msg){
        this.meg=msg;
    }
    @Override
    public void run(){
        for(int x=0;x<10;x++){
            if(x%2==0){
                this.meg.set("小关","学习Java");
            }else{
                this.meg.set("小梁","学习Python");
            }
        }
    }
}
class Consumer3 implements Runnable{
    private Message3 msg;
    public Consumer3(Message3 msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for (int x=0;x<10;x++){
            this.msg.get();
        }
    }
}

public class Test12 {
    public static void main(String []args){
        Message3 msg=new Message3();
        new Thread(new Producer3(msg)).start();
        new Thread(new Consumer3(msg)).start();
    }
}
//结果：
//小关-->学习Java
//小梁-->学习Python
//小关-->学习Java
//小梁-->学习Python
//小关-->学习Java
//小梁-->学习Python
//小关-->学习Java
//小梁-->学习Python
//小关-->学习Java
//小梁-->学习Python