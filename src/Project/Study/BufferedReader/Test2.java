package Project.Study.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[]args)throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag){                           //判断标志位
            System.out.println("请输入年龄：");   //提示信息
            String str = buf.readLine();        //以回车作为换行
            if (str.matches("\\d{1,3}")){//输入信息由数字组成
                System.out.println("年龄是："+Integer.parseInt(str));
                flag = false;                   //输入正确，退出循环
            } else{
                System.out.println("年龄输入错误。");
            }
        }
    }
}
