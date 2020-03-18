package Project.Study.Genericity;

interface IMessage<T>{      //定义泛型接口
    public void print(T t);
}
class MessageImpl<S>implements IMessage<S>{ //在子类继续设置泛型，此泛型也作为接口中的泛型类型
    public void print(S t){
        System.out.println(t);
    }
}
public class Test2 {
    public static void main(String[] args){
        IMessage<String>msg=new MessageImpl<String>();
        msg.print("HelloWorld");
    }
}
