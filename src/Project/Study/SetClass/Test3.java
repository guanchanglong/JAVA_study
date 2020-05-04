package Project.Study.SetClass;

import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{     //需要实现Comparable接口
    private String title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString(){
        return "书名："+this.title+",价格："+this.price+"\n";
    }
    @Override
    public int compareTo(Book o){           //排序方法，比较所有属性
        if (this.price>o.price){
            return 1;
        }else if (this.price<o.price){
            return -1;
        }else{
            return this.title.compareTo(o.title);//调用String类的比较大小
        }
    }
}
public class Test3 {
    public static void main(String[]args){
        Set<Book>all = new TreeSet<>();                 //实例化Set接口
        all.add(new Book("Java",99));       //保存数据
        all.add(new Book("C++",99));        //部分数据重复
        all.add(new Book("Python",89.2));
        System.out.println(all);
    }
}
