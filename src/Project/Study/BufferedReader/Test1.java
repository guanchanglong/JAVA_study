package Project.Study.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[]args)throws Exception{
        //System.in是InputStream类对象，BufferReader的构造方法里面需要接收Reader类对象
        //利用InputStreamReader将字节流对象变为字符流对象
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数据：");
        String str = buf.readLine();            //以回车作为换行
        System.out.println("输出的内容："+str);
    }
}
