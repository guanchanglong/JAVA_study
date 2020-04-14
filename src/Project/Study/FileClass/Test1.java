package Project.Study.FileClass;

import java.io.File;

public class Test1 {
    public static void main(String[]args) throws Exception {
        File file=new File("d:\\su.txt");//设置文件的路径
        File file1=new File("d:"+File.separator+"test.txt");//设置文件的路径
        if (file.exists()){//如果存在的话返回“true”，否则就返回“false”
            file.delete();  //存在就将原文件删除
        }else{
            System.out.println(file.createNewFile());//不存在该文件就创建文件
        }
    }
}
