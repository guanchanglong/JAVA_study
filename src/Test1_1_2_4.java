class Book6 {
    private String title;
    private double price;

    public Book6(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return "书名：" + title + ",价格：" + price;
    }
}
public class Test1_1_2_4 {
    public static void main(String args[]){
        Book6 book = new Book6("java开发",89.2);
        System.out.println(book.getTitle());
    }
}
