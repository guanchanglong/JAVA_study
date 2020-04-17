package Project.Study.WriterClass;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Test2 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"Test1"+File.separator+"test2.txt");//定义输出文件的路径
        if (!file.getParentFile().exists()){        //判断文件目录是否存在
            file.getParentFile().mkdirs();          //若不存在就创建文件目录
        }
        Writer writer=new FileWriter(file);         //实例化了Writer类的对象
        String str="Hi!!!";                         //定义输出内容
        writer.write(str);                          //输出字符串数据
        writer.flush();                             //强制刷新缓冲区
    }
}
