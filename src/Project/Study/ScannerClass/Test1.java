package Project.Study.ScannerClass;

import java.util.Scanner;

public class Test1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);               //准备接收键盘输入数据
        System.out.println("请输入内容：");                       //提示信息
        if (scanner.hasNext()){                                 //是否有输入数据
            System.out.println("输入内容为："+scanner.next());    //存在内容则输出
        }
        scanner.close();
    }
}
