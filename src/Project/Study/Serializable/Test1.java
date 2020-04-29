package Project.Study.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[]args)throws Exception{
        dser();
    }
    public static void dser() throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(
                "d:"+File.separator+"Test"+File.separator+"test1.txt")));
        Object obj = objectInputStream.readObject();
        Book book = (Book)obj;      //反序列化对象
        System.out.println(book);   //转型
        objectInputStream.close();
    }
}
