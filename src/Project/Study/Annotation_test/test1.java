package Project.Study.Annotation_test;

class Book<T>{     //只要正确进行了覆写，就不会出现编译的语法错误
    private T title;
    public void setTitle(T title){
        this.title=title;
    }
    public T getTitle(){
        return title;
    }
}
public class test1 {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String [] args){
        Book book=new Book();
        book.setTitle("Hello");
    }
}
