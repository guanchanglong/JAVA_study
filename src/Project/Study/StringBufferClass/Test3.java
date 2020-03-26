package Project.Study.StringBufferClass;

public class Test3 {
    public static void main(String []args){
        StringBuffer buf=new StringBuffer("Hello World!!!");    //String变为StringBuffer
        String str=buf.toString();                              //任何类都具备toString()方法
        System.out.println(str);
    }
}
