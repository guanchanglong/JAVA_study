class Book5{
    private String title;
    private double price;
    public Book5(String t,double p){
        title = t;
        price = p;
    }
    public String getInfo(){
        return "书名："+title+"价格："+price;
    }
}
public class Test1_1_6
{
    public static void main(String args[])
    {
        Book5 book[] = new Book5[]{
                new Book5("java",79.8),
                new Book5("jsp",69.8),
                new Book5("android",89.8),
        };
        for(int x=0;x<book.length;x++)
        {
            System.out.println(book[x].getInfo());
        }
    }
}
