class Book10{
    private String title;
    private double price;
    public Book10(String title,double price){
        this.title=title;
        this.price=price;
    }
    public boolean compare(Book10 book){
        if(book==null){
            return false;
        }
        if (this==book){    //内存地址相同
            return true;
        }
        if (this.title.equals(book.title)&&this.price==book.price){     //属性判断
            return true;
        }
        else{
            return false;
        }
    }
}
public class Test1_1_2_9 {
    public static void main(String args[]){
        Book10 b1=new Book10("Java开发",79.8);
        Book10 b2=new Book10("Java开发",79.8);
        if (b1.compare(b2)){    //对象比较
            System.out.println("是同一个对象");
        }
        else{
            System.out.println("不是同一个对象");
        }
    }
}
//结果：是同一个对象