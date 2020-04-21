package Project.Study.FileCopyCase;

import java.io.*;

public class Test {
    public static void main(String[]args)throws Exception{
        long start=System.currentTimeMillis();
        if (args.length!=2){
            System.out.println("命令执行错误！");
            System.exit(1);
        }
        //如果输入参数正确，应该进行源文件有效性的检验
        File inFile=new File(args[0]);
        if (!inFile.exists()){
            System.out.println("源文件不存在，请确认执行路径。");
            System.exit(1);
        }
        //如果此时源文件正确，就需要定义输出文件，同时要考虑到输出文件有目录
        File outFile=new File(args[1]);
        if (!outFile.getParentFile().exists()){ //输出文件路径不存在
            outFile.getParentFile().mkdirs();   //创建目录
        }
        //实现文件内容的复制，分别定义输出流与输入流对象
        InputStream input=new FileInputStream(inFile);
        OutputStream output=new FileOutputStream(outFile);
        int temp=0;                     //保存每次读取的数据长度
        byte[]data=new byte[1024];      //每次读取1024个字节
        //将每次读取进来的数据保存在字节数组里面，并且返回读取个数
        while((temp=input.read(data))!=-1){ //循环读取数据
            output.write(data,0,temp);  //输出数组
        }
        input.close();                      //关闭输入流
        output.close();                     //关闭输出流
        long end=System.currentTimeMillis();//取得操作时间
        System.out.println("复制所花费的时间："+(end-start));
    }
}
