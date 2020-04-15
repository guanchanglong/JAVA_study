package Project.Study.OutputStreamClass;

import java.io.*;

public class Test3 {
    public static void main(String[]args) throws Exception {
        //1.定义要输出文件的路径
        File file=new File("d:"+File.separator+"Test"+File.separator+"Test.txt");
        if (!file.getParentFile().exists()){//文件目录不存在
            file.getParentFile().mkdirs();  //创建目录
        }
        //2.应使用OutputStream和其子类进行对象的实例化，此时目录存在，文件还不存在
        OutputStream outputStream=new FileOutputStream(file,true);//追加模式
        //字节流输出需要使用byte类型，需要将String类对象变为字节数组
        String str="Hello World!!!";
        byte[]data=str.getBytes();  //将字符串变为字节数组
        outputStream.write(data,5,9);//内容输出
        outputStream.close();       //资源操作的最后一定要进行关闭
    }
}
