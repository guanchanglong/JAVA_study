class Book7{
    private String title;
    private double price;
    public Book7(){
        System.out.println("一个新的Book7类对象产生");
    }
    public Book7(String title){
        this();                             //调用本类无参构造方法
        this.title = title;
    }
    public Book7(String title,double price){
        this(title);                        //调用本类有参构造方法
        this.price = price;
    }
    public String getTitle(){
        return "书名："+this.title+"，价格："+this.price;
    }
}
public class Test1_1_2_5 {
    public static void main(String args[]){
        Book7 book = new Book7("java开发",89.2);
        System.out.println(book.getTitle());
    }
}
