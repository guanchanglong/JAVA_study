class Book4{
    private String title;
    private double price;
    public Book4(String t,double p){
        title = t;
        price = p;
    }
    public void getInfo(){
        System.out.println("图书名称："+title+",价格："+price);
    }
}
public class Test1_6 {
    public static void main(String args[]){
        new Book4("Java开发",69.8).getInfo();     //匿名对象
    }
}
