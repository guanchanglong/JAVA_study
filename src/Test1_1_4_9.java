interface Message{
    public void print();
}
public class Test1_1_4_9 {
    public static void main(String args[]){
        fun(new Message(){
            public void print(){
                System.out.println("Hello World");
            }
        });
    }
    public static void fun(Message msg){
        msg.print();
    }
}
