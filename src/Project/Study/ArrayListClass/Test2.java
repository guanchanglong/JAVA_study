package Project.Study.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public boolean equals(Object obj){//必须覆写此方法，否则remove()、contains()无法使用
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Book)){
            return false;
        }
        Book book = (Book)obj;
        if (this.title.equals(book.title)&&this.price==book.price){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "书名："+this.title+",价格："+this.price+"\n";
    }
}
public class Test2 {
    public static void main(String[]args){
        List<Book>all = new ArrayList<>();              //List接口对象
        all.add(new Book("Java",99));       //保存自定义类对象
        all.add(new Book("C++",99.9));
        all.add(new Book("Python",89));
        all.remove(new Book("Java",99));    //删除对象
        System.out.println(all);
    }
}
