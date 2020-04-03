package Project.Study.ComparatorClass;

class Book{
    private String title;
    private double price;
    public Book(){}
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString(){
        return "书名："+this.title+",价格："+this.price+"\n";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
class BookComparator implements java.util.Comparator<Book>{
    @Override
    public int compare(Book o1,Book o2){
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
public class Test1 {
    public static void main(String[]args){
        Book[]books=new Book[]{
                new Book("Java",79.8),
                new Book("C++",69.8),
                new Book("Python",75.8),
                new Book("C",63.8)
        };
        java.util.Arrays.sort(books,new BookComparator());
        System.out.println(java.util.Arrays.toString(books));
    }
}
