package Project.Study.ServerSocket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test2 {
    public static void main(String[]args)throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);     //定义连接端口
        Socket socket = serverSocket.accept();                          //等待客户连接
        //得到客户端输入的数据以及向客户端输出数据的对象，利用扫描流接收，打印流输出
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        boolean flag = true;                                            //设置循环标记
        while (flag){
            if (scanner.hasNext()){                                     //是否有内容输入
                String str = scanner.next().trim();                     //得到客户端发送的内容，并删除空格
                if (str.equalsIgnoreCase("###")){          //程序结束标记
                    out.println("再见！");                                 //输出结束信息
                    flag = false;                                           //退出循环
                }else{                                                  //回应输入信息
                    out.println("ECHO:"+str);                           //加上前缀返回
                }
            }
        }
        scanner.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}
