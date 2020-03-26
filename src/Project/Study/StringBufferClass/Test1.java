package Project.Study.StringBufferClass;

public class Test1 {
    public static void main(String []args){
        StringBuffer buf=new StringBuffer();
        buf.append("Hello ").append("World").append("!!!");
        change(buf);
        System.out.println(buf);
    }
    public static void change(StringBuffer temp){
        temp.append("\n").append("Hi").append("!!!");
    }
}

