class Book3{
    private String title;
    private double price;
    public Book3(String t,double p){
        setTitle(t);
        setPrice(p);
    }
    public void setTitle(String t){
        title = t;
    }
    public void setPrice(double p){
        price = p;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void getInfo(){
        System.out.println("图书名称："+title+",价格："+price);
    }
}
public class Test1_5 {
    public static void main(String args[]){
        Book3 book = new Book3("Java开发",69.8);
        book.getInfo();
    }
}
