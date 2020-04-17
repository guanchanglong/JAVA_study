package Project.Study.WriterClass;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Test1 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"Test1"+File.separator+"test.txt");//定义要输出文件的路径
        if (!file.getParentFile().exists()){//判断目录是否存在
            file.getParentFile().mkdirs();  //创建文件目录
        }
        Writer writer=new FileWriter(file); //实例化了Writer类的对象
        String str="Hello World!!!";        //定义输出内容
        writer.write(str);                  //输出字符串内容
        writer.close();                     //关闭输出流
    }
}
