package Project.Study.ScannerClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Test4 {
    public static void main(String[]args)throws Exception{
        Scanner scanner = new Scanner(new FileInputStream(new File("d:"+
                File.separator+"Test"+File.separator+"test.txt")));         //设置读取的文件输入流
        scanner.useDelimiter("\n");                                         //设置读取的分隔符
        while (scanner.hasNext()){                                          //循环读取
            System.out.println(scanner.next());                             //直接输出读取数据
        }
        scanner.close();
    }
}
