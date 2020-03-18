package Project.Study.BuiltInFunctionalInterface;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String args[]){
        Predicate<String>pre="Hello World"::equalsIgnoreCase;
        System.out.println(pre.test("HELLO WORLD"));
    }
}
