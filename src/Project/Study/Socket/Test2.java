package Project.Study.Socket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test2 {
    public static void main(String[]args)throws Exception{
        Socket socket = new Socket("localhost",9999);   //服务器地址和端口
        Scanner input = new Scanner(System.in);                     //键盘输入数据
        //利用Scanner包装客户端输入数据(服务器端输出)，PrintStream包装客户端输出数据
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        input.useDelimiter("\n");                                   //设置键盘输入分隔符
        scanner.useDelimiter("\n");                                 //设置回应数据分隔符
        boolean flag = true;                                        //循环标志
        while (flag){
            System.out.println("请输入要发送的数据：");
            if (input.hasNext()){                                   //判断键盘是否输入数据
                String str = input.next().trim();                   //取得键盘输入的数据
                out.println(str);                                   //发送数据到服务器端
                if (str.equalsIgnoreCase("###")){       //结束标记
                    flag = false;                                       //结束循环
                }
                if (scanner.hasNext()){                             //服务器有回应
                    System.out.println(scanner.next());             //输出回应数据
                }
            }
        }
        input.close();
        scanner.close();
        out.close();
        socket.close();
    }
}
