package Project.Study.BuiltInFunctionalInterface;
import java.util.function.*;

public class Test1 {
    public static void main(String args[]){
        Function<String,Boolean>fun="Hello World"::startsWith;
        System.out.println(fun.apply("H"));
        System.out.println(fun.apply("e"));
        System.out.println(fun.apply("ll"));
    }
}
