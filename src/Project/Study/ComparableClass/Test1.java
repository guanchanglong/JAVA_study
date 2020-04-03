package Project.Study.ComparableClass;

import java.util.Arrays;

class Book implements Comparable<Book>{
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
    public int compareTo(Book o){
        return Double.compare(this.price, o.price);
    }
}
public class Test1 {
    public static void main(String[]args){
        Book[] book =new Book[]{
                new Book("Java",79.8),
                new Book("C++",69.8),
                new Book("Python",75.8),
                new Book("C",63.8)
        };
        Arrays.sort(book);
        System.out.println(Arrays.toString(book));
    }
}
