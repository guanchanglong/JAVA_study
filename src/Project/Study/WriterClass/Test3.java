package Project.Study.WriterClass;

import java.io.*;

public class Test3 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"Test"+File.separator+"test3.txt");//定义要输出文件的路径
        if (!file.getParentFile().exists()){//判断父路径是否存在
            file.getParentFile().mkdirs();//创建父路径
        }
        OutputStream outputStream=new FileOutputStream(file);//字节流
        Writer writer=new OutputStreamWriter(outputStream);//将OutputStream类对象传递给OutputStreamWriter类的构造方法，而后向上转型为Writer
        writer.write("Hello World!!!");//Writer类的方法
        writer.flush();
        writer.close();
    }
}
