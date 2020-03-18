class Book1{
    private String title;
    private double price;
    public Book1(String title,double price){
        this.title=title;
        this.price=price;
    }
    public String toString(){
        return "书名："+this.title+",价格："+this.price;
    }
}
public class Test1_1_4_5 {
    public static void main(String args[]){
        Book1 b=new Book1("Java开发",79.9);
        System.out.println(b);
    }
}
