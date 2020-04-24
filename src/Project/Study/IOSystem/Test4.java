package Project.Study.IOSystem;

import java.io.InputStream;

public class Test4 {
    public static void main(String[]args)throws Exception{
        InputStream inputStream=System.in;
        StringBuffer buf=new StringBuffer();    //接收输入数据
        System.out.println("请输入数据：");
        int temp=0;                             //每次读取数据的长度
        while ((temp=inputStream.read())!=-1){  //判断是否有输入数据
            if (temp=='\n'){                    //判断是否有回车符
                break;
            }
            buf.append((char)temp);             //保存读取数据
        }
        System.out.println("输入数据为："+buf);   //输出数据
    }
}
