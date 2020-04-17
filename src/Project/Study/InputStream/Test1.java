package Project.Study.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test1 {
    public static void main(String[]args) throws Exception {
        File file=new File("d:"+File.separator+"Test"+File.separator+"test.txt");//定义要输出文件的路径
        if (file.exists()){                         //判断文件是否存在后才可以进行读取
            InputStream inputStream=new FileInputStream(file);//使用InputStream进行读取
            byte[]data=new byte[1024];              //准备一个1024的数组
            int len=inputStream.read(data);         //进行数据读取，将内容保存到字节数组中
            inputStream.close();                    //关闭输入流
            System.out.println("【"+new String(data,0,len)+"】");//将读取出来的字节数组变为字符串进行输出
        }
    }
}
//结果：
//【Hello World!!!】
