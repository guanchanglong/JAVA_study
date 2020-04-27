package Project.Study.ScannerClass;

import java.util.Scanner;

public class Test3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);                   //准备接收键盘输入数据
        System.out.println("请输入生日：");
        if (scanner.hasNext("\\d{4}-\\d{1,2}-\\d{1,2}")){   //正则验证
            String str = scanner.next("\\d{4}-\\d{1,2}-\\d{1,2}");//接收数据
            System.out.println("生日为："+str);
        }else{                                          //数据格式错误
            System.out.println("输入的生日格式错误！");
        }
        scanner.close();
    }
}
