class Book2{
    private String title;
    private double price;
    public void setTitle(String t){
        title = t;
    }
    public void setPrice(double p){
        if(p>0.0){//数据验证
            price = p;
        }
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
public class Test1_4 {
    public static void main(String args[]){
        Book2 book = new Book2();
        book.setTitle("Java开发");
        book.setPrice(-89.9);
        book.getInfo();
    }
}
