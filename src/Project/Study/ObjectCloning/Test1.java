package Project.Study.ObjectCloning;

class Book implements Cloneable{
    private String title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "书名："+this.title+",价格："+this.price;
    }
    //由于此类需要对象克隆操作，所以才需要进行方法的覆写
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Test1 {
    public static void main(String[]args) throws Exception {
        Book book1=new Book("Java",79);
        Book book2=(Book)book1.clone();
        book2.setTitle("C++");
        System.out.println(book1);
        System.out.println(book2);
    }
}
