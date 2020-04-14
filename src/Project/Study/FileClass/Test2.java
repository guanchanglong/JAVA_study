package Project.Study.FileClass;

import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("d:" + File.separator + "IDEA" + File.separator + "JAVA1" + File.separator + "src" + File.separator + "Project" + File.separator + "Study" + File.separator + "FileClass" + File.separator + "test.txt");
        File file2 = new File("d:" + File.separator + "IDEA" + File.separator + "JAVA1" + File.separator + "src" + File.separator + "Project" + File.separator + "Study" + File.separator + "FileClass" + File.separator + "1" + File.separator + "test.txt");
        if (!file1.getParentFile().exists()) {//现在父路径不存在
            file1.getParentFile().mkdirs();//直接创建父路径
        }
        System.out.println(file1.createNewFile());//创建新文件
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        System.out.println(file2.createNewFile());

    }
}