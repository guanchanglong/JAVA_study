package Project.Study.PrintStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test3 {
    public static void main(String[]args)throws Exception{
        String name="小关爱吃汉堡";
        int age=19;
        double score=99.99999;
        PrintStream printStream=new PrintStream(new FileOutputStream(new File("d:"+
                File.separator+"Test"+File.separator+"test3.txt")));
        printStream.printf("姓名：%s，年龄：%d，成绩：%f",name,age,score);
        printStream.close();
    }
}
