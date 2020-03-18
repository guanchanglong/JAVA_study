public class Test1_3 {
    public static void main(String args[]){
        Book BookA = new Book();//声明并实例化
        Book BookB = new Book();//声明并实例化
        BookA.title = "java开发";
        BookA.price = 89.9;
        BookB.title = "JSP开发";
        BookB.price = 69.9;
        BookB=BookA;//引用传递
        BookB.getlnfo();
    }
}
