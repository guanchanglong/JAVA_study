package Project.Study.TMemoryStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {
    public static void main(String[]args)throws Exception{
        String str="Hello World!!!";//需要转换的字符串
        //本次将通过内存操作流实现转换，先将数据保存在内存流里面，再从里面取出每一个数据
        //将所有要读取的数据设置到内存输入流中，本次利用向上转型为InputStream类实例化
        InputStream inputStream=new ByteArrayInputStream(str.getBytes());
        OutputStream outputStream=new ByteArrayOutputStream();//为了能够将所有的内存流数据取出，可以使用ByteArrayOutputStream
        int temp=0;
        //经过此次循环后，所有数据都将保存在内存输出流对象中
        while((temp=inputStream.read())!=-1){//每次读取一个数据
            //将读取进来的数据转换为大写字母，利用Character.toUpperCase()可以保证只转换字母
            outputStream.write(Character.toUpperCase(temp));//字节输出流
        }
        System.out.println(outputStream);//调用toString()方法
        inputStream.close();    //关闭输入流
        outputStream.close();   //关闭输出流
    }
}
