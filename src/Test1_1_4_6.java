class Book14{
    private String title;
    private double price;
    public Book14(String title,double price){
        this.title=title;
        this.price=price;
    }
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Book14)){
            return false;
        }
        Book14 book=(Book14)obj;
        if (this.title.equals(book.title)&&this.price==book.price){
            return true;
        }
        return false;
    }
    public String toString(){
        return "书名："+this.title+",价格："+this.price;
    }
}
public class Test1_1_4_6 {
    public static void main(String args[]){
        Book14 b1=new Book14("Java开发",79.9);
        Book14 b2=new Book14("Java开发",79.9);
        System.out.println(b1.equals(b2));
    }
}
