package Project.Study.Lambda_test;
@FunctionalInterface
interface IMessage2{
    int add(int... args);
    static int sum(int...args){
        int sum=0;
        for(int temp:args){
            sum+=temp;
        }
        return sum;
    }
}
public class Test2 {
    public static void main(String [] args){
        fun2((int...param)->IMessage2.sum(param));
    }
    public static void fun2(IMessage2 msg){
        System.out.println(msg.add(10,20,30));
    }
}
