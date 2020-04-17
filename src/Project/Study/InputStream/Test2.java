package Project.Study.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test2 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"Test"+File.separator+"test.txt");//定义输出文件的路径
        if (file.exists()){                                         //判断文件是否存在后才可以进行读取
            InputStream inputStream=new FileInputStream(file);      //使用InputStream进行读取
            byte[]data=new byte[1024];                              //准备一个1024的数组
            int foot=0;                                             //表示字节数组的操作脚标
            int temp=0;                                             //表示接收每次读取的字节数据
            while((temp=inputStream.read())!=-1){                   //当inputStream.read()!=-1，即输出文件中还有内容
                data[foot++]=(byte)temp;                            //有内容就进行保存
            }
            inputStream.close();                                    //关闭输出流
            System.out.println("【"+new String(data,0,foot)+"】");
        }
    }
}
//结果：
//【Hello World!!!】
