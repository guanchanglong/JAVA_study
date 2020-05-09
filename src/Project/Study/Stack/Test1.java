package Project.Study.Stack;

import java.util.Stack;

public class Test1 {
    public static void main(String[]args){
        Stack<String>all = new Stack<>();
        all.push("!!!");
        all.push("World ");
        all.push("Hello ");
        System.out.print(all.pop());
        System.out.print(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());//EmptyStackException
    }
}
