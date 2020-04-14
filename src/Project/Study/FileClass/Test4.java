package Project.Study.FileClass;

import java.io.File;

public class Test4 {
    public static void main(String[]args){
        File file=new File("d:"+File.separator);
        if (file.isDirectory()){//判断当前是否为目录
            File[]result=file.listFiles();
            assert result != null;
            for (File x:result
                 ) {
                System.out.println(x);
            }
        }
    }
}
