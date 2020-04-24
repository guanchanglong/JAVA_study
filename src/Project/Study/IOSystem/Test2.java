package Project.Study.IOSystem;

import java.io.OutputStream;

public class Test2 {
    public static void main(String[]args)throws Exception{
        OutputStream outputStream=System.out;                   //OutputStream就为屏幕输出
        outputStream.write("Hello World!!!".getBytes());        //屏幕输出
    }
}
