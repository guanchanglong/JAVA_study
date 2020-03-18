class Book8{
    public void print(){
        System.out.println("this="+this);
    }
}
public class Test1_1_2_6 {
    public static void main(String args[]){
        Book8 book1 = new Book8();
        System.out.println("book1="+book1);
        book1.print();
        Book8 book2 = new Book8();
        System.out.println("book2="+book2);
        book2.print();
    }
}
