package Project.Study.StringBufferClass;

public class Test7 {
    public static void main(String[]args){
        StringBuffer buf=new StringBuffer("Hello");
        buf.insert(0,"Now!").insert(9," World");
        System.out.println(buf);
    }
}
