package Project.Study.BufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test3{
    public static void main(String[]args)throws Exception{
        File file = new File("d:"+File.separator+"Test"+File.separator+"test3.txt");
        //使用文件输入流实例化BufferedReader类对象
        BufferedReader buf = new BufferedReader(new FileReader(file));
        String str = null;                      //接收输入对象
        while((str = buf.readLine())!=null){    //读取数据并判断是否存在
            System.out.println(str);            //输出读取内容
        }
        buf.close();
    }
}
