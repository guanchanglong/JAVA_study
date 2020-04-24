package Project.Study.PrintStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test2 {
    public static void main(String[]args)throws Exception{
        //实例化PrintStream类对象，本次利用FileOutputStream类实例化PrintStream类对象
        PrintStream printStream=new PrintStream(new FileOutputStream(new File("d:"+
                File.separator+"Test"+File.separator+"test3.txt")));
        printStream.println("你好 世界！！！");
        printStream.println("Hello World!!!");
        printStream.println(1+1);
        printStream.println(1.1+1.1);
        printStream.close();
    }
}
