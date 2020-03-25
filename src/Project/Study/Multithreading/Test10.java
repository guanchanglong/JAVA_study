package Project.Study.Multithreading;

class Message{
    private String title;   //保存信息的标题
    private String content; //保存信息的内容
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
class Producer implements Runnable{
    private Message msg=null;
    public Producer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for (int x=0;x<50;x++){
            if(x%2==0){
                this.msg.setTitle("小关");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                this.msg.setContent("学习Java");
            }else{
                this.msg.setTitle("小梁");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                this.msg.setContent("学习python");
            }
        }
    }
}
class Consumer implements Runnable{
    private Message msg;
    public Consumer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for(int x=0;x<50;x++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.msg.getTitle()+"-->"+this.msg.getContent());
        }
    }
}
public class Test10 {
    public static void main(String []args){
        Message msg=new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
//小梁-->学习Java
//小关-->学习python
//小梁-->学习Java
//小关-->学习python
//小梁-->学习Java
//小关-->学习python
//小梁-->学习Java
//小关-->学习python
//小梁-->学习Java