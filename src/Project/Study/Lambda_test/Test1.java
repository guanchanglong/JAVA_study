package Project.Study.Lambda_test;

interface IMessage{
    public int add(int x,int y);
}
public class Test1 {
    public static void main(String [] args){
        fun((s1,s2)->{
            return s1-s2;
        });
    }
    public static void fun(IMessage msg){
        System.out.println(msg.add(10,20));
    }
}
