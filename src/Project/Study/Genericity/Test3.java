package Project.Study.Genericity;

interface IMessage1<T>{
    public void print(T t);
}
class MessageImpl1 implements IMessage1<String>{
    public void print(String t){
        System.out.println(t);
    }
}
public class Test3 {
    public static void main(String [] args){
        IMessage1<String>msg=new MessageImpl1();
        msg.print("HelloWorld");
    }
}
