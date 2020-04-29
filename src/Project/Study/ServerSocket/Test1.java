package Project.Study.ServerSocket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1 {
    public static void main(String[]args)throws Exception{
        ServerSocket server = new ServerSocket(9999);   //所有的服务器必须有接口
        System.out.println("等待客户端连接...");
        Socket socket = server.accept();                      //等待客户端连接
        //OutputStream并不方便进行内容的输出，所以利用打印流完成输出
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("Hello World!!!");                          //输出数据
        out.close();
        socket.close();
        server.close();
    }
}
