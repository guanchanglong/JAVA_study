package Project.Study.Multithreading;

//class MyTread2 implements Runnable{
//    private String name;
//    public MyTread2(String name){
//        this.name=name;
//    }
//    @Override
//    public void run(){
        //for(int x=0;x<200;x++){
        //    System.out.println(this.name+"-->"+x);
        //}
//    }
//}
public class Test2 {
    public static void main(String []args){
        String name="线程对象";
        new Thread(()->{
            for(int x=0;x<200;x++){
                System.out.println(name+"-->"+x);
            }
        }).start();
        //MyTread2 mt1=new MyTread2("线程A");
        //MyTread2 mt2=new MyTread2("线程B");
        //MyTread2 mt3=new MyTread2("线程C");
        //new Thread(mt1).start();
        //new Thread(mt2).start();
        //new Thread(mt3).start();
    }
}
