package Project.Study.Multithreading;

class Message2{
    private String title;   //保存信息的标题
    private String content; //保存信息的内容
    public synchronized void set(String title,String content){
        this.title=title;
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.content=content;
    }
    public synchronized void get(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
    }
}
class Producer2 implements Runnable{
    private Message2 meg=null;
    public Producer2(Message2 msg){
        this.meg=msg;
    }
    @Override
    public void run(){
        for(int x=0;x<20;x++){
            if(x%2==0){
                this.meg.set("小关","学习Java");
            }else{
                this.meg.set("小梁","学习Python");
            }
        }
    }
}
class Consumer2 implements Runnable{
    private Message2 msg=null;
    public Consumer2(Message2 msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for (int x=0;x<20;x++){
            this.msg.get();
        }
    }
}
public class Test11 {
    public static void main(String []args)throws Exception{
        Message2 msg=new Message2();
        new Thread(new Producer2(msg)).start();
        new Thread(new Consumer2(msg)).start();
    }
}
