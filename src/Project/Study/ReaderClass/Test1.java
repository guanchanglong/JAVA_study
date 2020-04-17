package Project.Study.ReaderClass;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"Test1"+File.separator+"test.txt");//定义要输出的路径
        if (file.exists()){                                     //判断文件是否存在
            Reader reader=new FileReader(file);                 //为Reader对象实例化
            char[]data=new char[1024];                          //开辟字符数组，接收读取数据
            int len=reader.read(data);                          //进行数据读取
            reader.close();                                     //关闭输入流
            System.out.println(new String(data,0,len));
        }
    }
}
//结果：
//Hello World!!!
