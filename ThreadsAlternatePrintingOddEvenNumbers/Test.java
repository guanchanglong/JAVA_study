package Project.Study.ThreadsAlternatePrintingOddEvenNumbers;

class Number{
    private String title;
    private int data;
    private boolean flag=true;
    public synchronized void set(String title,int data){
        if(this.flag==false){
            try {
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.title=title;
        this.data=data;
        this.flag=false;
        super.notify();
    }
    public synchronized void get(){
        if (this.flag==true){
            try {
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.title+":"+this.data);
        this.flag=true;
        super.notify();
    }
}
class Input implements Runnable{
    private Number num;
    public Input(Number num){
        this.num=num;
    }
    @Override
    public void run(){
        for(int x=0;x<1000;x++){
            if(x%2!=0){
                this.num.set("奇数",x);
            }else{
                this.num.set("偶数",x);
            }
        }
    }
}
class Output implements Runnable{
    private Number num;
    public Output(Number num){
        this.num=num;
    }
    @Override
    public void run(){
        for (int x=0;x<1000;x++){
            this.num.get();
        }
    }
}
public class Test {
    public static void main(String []args){
        Number num=new Number();
        new Thread(new Input(num)).start();
        new Thread(new Output(num)).start();
    }
}
