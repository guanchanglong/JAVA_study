package Project.Study.BuiltInFunctionalInterface;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String args[]){
        Supplier<String>sup="Hello World"::toUpperCase;
        System.out.println(sup.get());
    }
}
