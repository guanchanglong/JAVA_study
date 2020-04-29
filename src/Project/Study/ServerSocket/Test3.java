package Project.Study.ServerSocket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class EchoThread implements Runnable{   //建立线程类
    private Socket socket;              //每个线程处理一个客户端
    public EchoThread(Socket socket){   //创建线程对象时传递Socket
        this.socket=socket;
    }
    @Override
    public void run(){
        try {                           //每个线程对象取得各自Socket的输入流与输出流
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());
            boolean flag = true;                            //控制多次接收操作
            while (flag){
                if (scanner.hasNext()){                     //判断是否有内容
                    String str = scanner.next().trim();     //得到客户端发送的内容
                    if (str.equalsIgnoreCase("###")){//程序结束
                        out.println("再见！");
                        flag = false;                       //退出循环
                    }else{                                  //应该回应输入信息
                        out.println("ECHO:"+str);           //回应信息
                    }
                }
            }
            scanner.close();
            out.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Test3 {
    public static void main(String[]args)throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);//在9999端口上监听
        boolean flag = true;                                    //循环标记
        while (flag){                                           //接收多个客户端请求
            Socket socket = serverSocket.accept();              //客户端连接
            new Thread(new EchoThread(socket)).start();         //创建并启动新线程
        }
        serverSocket.close();
    }
}
