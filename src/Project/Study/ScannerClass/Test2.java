package Project.Study.ScannerClass;

import java.util.Scanner;

public class Test2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);//准备接收键盘输入数据
        System.out.println("请输入成绩：");
        if (scanner.hasNextDouble()){            //表示输入的是一个小数
            double score = scanner.nextDouble();    //省略了转型
            System.out.println("成绩为："+score);
        }else{                                  //表示输入的不是一个数字
            System.out.println("输入的不是数字");
        }
        scanner.close();
    }
}
