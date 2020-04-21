package Project.Study.CharacterEncoding;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test2 {
    public static void main(String[]args)throws Exception{
        File file=new File("D:"+File.separator+"Test"+File.separator+"test.txt");
        OutputStream outputStream=new FileOutputStream(file);
        outputStream.write("输出结果：Hello World".getBytes("ISO8859-1"));//强制改变文字的编码，此操作可以通过String类的getBytes()方法实现
        outputStream.close();
    }
}
