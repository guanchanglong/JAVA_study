package Project.Study.PrintStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

class PrintUtil{                         //实现专门的输出操作功能
    private OutputStream outputStream;  //输出只能依靠OutputStream

    /**
     * 输出流的输出目标要通过构造方法传递
     * @param outputStream
     */
    public PrintUtil(OutputStream outputStream){
        this.outputStream=outputStream;
    }
    public void print(int x){               //输出int型数据
        this.print(String.valueOf(x));      //调用本类字符串的输出方法
    }
    public void print(String x){
        try{                                //采用OutputStream类中定义的方法，将字符串转变为字节数组后输出
            this.outputStream.write(x.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void print(double x){        //输出double型数据
        this.print(String.valueOf(x));
    }
    public void println(int x){         //输出数据后换行
        this.println(String.valueOf(x));
    }
    public void println(String x){      //输出数据后换行
        this.print(x.concat("\n"));
    }
    public void println(double x){
        this.println(String.valueOf(x));
    }
    public void close(){                //输出流关闭
        try{
            this.outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Test1 {
    public static void main(String[]args)throws Exception{
        PrintUtil printUtil=new PrintUtil(new FileOutputStream(new File("d:"+
                File.separator+"Test"+File.separator+"test3.txt")));
        printUtil.println("你好!!!");
        printUtil.println("Hello World!!!");
        printUtil.println(1+1);
        printUtil.println(1.1+1.1);
        printUtil.close();
    }
}
