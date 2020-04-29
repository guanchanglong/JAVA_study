package Project.Study.Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{//此类可以被序列化
    private transient String title;//此属性无法被序列化
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString(){
        return "书名："+this.title+"，价格："+this.price;
    }
}
public class Test2 {
    public static void main(String[]args)throws Exception{
        ser();
    }
    public static void ser()throws Exception{
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File(
                "d:"+File.separator+"Test"+File.separator+"test1.txt")));
        objectOutputStream.writeObject(new Book("C++",66.66));//序列化对象
        objectOutputStream.close();
    }
}
