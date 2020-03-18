class Book9{
    private String title;
    private double price;
    public Book9(String title,double price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
}
public class Test1_1_2_8 {
    public static void main(String args[]){
        Book9 b1 = new Book9("java开发",79.8);
        Book9 b2 = new Book9("java开发",79.8);
        if(b1.getTitle().equals(b2.getTitle())&&b1.getPrice()==b2.getPrice()){
            System.out.println("是同一个对象");
        }
        else{
            System.out.println("不是同一个对象");
        }
    }
}
