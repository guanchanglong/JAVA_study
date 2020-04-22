package Project.Study.TMemoryStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test2 {
    public static void main(String[]args)throws Exception{
        File fileA=new File("d:"+File.separator+"Test1"+File.separator+"test.txt"); //文件路径
        File fileB=new File("d:"+File.separator+"Test1"+File.separator+"test2.txt");
        InputStream inputStreamA=new FileInputStream(fileA);    //字节输入流
        InputStream inputStreamB=new FileInputStream(fileB);
        ByteArrayOutputStream output=new ByteArrayOutputStream();//内存输出流
        int temp=0;                             //每次读一个字节
        while((temp=inputStreamA.read())!=-1){  //循环读取数据
            output.write(temp);                 //将数据保存到输出流
        }
        while((temp=inputStreamB.read())!=-1){
            output.write(temp);
        }
        //现在所有的内容都保存在了内存输出流里面，所有的内容变为字节数组取出
        byte[]data=output.toByteArray();        //取出全部数据
        output.close();                         //关闭输出流
        inputStreamA.close();
        inputStreamB.close();
        System.out.println(new String(data));   //字节转换为字符串输出
    }
}
