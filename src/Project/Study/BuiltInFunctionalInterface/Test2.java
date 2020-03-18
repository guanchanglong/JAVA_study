package Project.Study.BuiltInFunctionalInterface;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String args[]){
        Consumer<String>cons=System.out::println;
        cons.accept("Hello World");
    }
}
