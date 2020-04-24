package Project.Study.IOSystem;

import java.io.InputStream;

public class Test3 {
    public static void main(String[]args)throws Exception{
        InputStream inputStream = System.in;        //System.in为InputStream类实例
        byte[]data=new byte[1024];                  //开辟空间接收数据
        System.out.println("请输入数据：");
        int len=inputStream.read(data);             //读取数据并返回长度
        System.out.println("输入的数据为："+new String(data,0,len));
    }
}
