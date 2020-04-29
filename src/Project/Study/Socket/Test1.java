package Project.Study.Socket;

import java.net.Socket;
import java.util.Scanner;

public class Test1 {
    public static void main(String[]args)throws Exception{
        Socket socket = new Socket("localhost",9999);//连接服务器
        //取得客户端的输入数据流对象，表示接收服务器端的输出信息
        Scanner scanner = new Scanner(socket.getInputStream());
        scanner.useDelimiter("\n");     //设置分隔符
        if (scanner.hasNext()){         //判断是否有数据
            System.out.println("回应数据："+scanner.next());//取出数据
        }
        scanner.close();
        socket.close();
    }
}
