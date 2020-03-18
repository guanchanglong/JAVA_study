class Book12{
    private String title;
    private double price;
    private static String pub="清华大学出版社";
    public Book12(String title,double price){
        this.title=title;
        this.price=price;
    }
    public static void setPub(String p){
        pub=p;
    }
    public String getInfo(){
        return "图书名称："+this.title+",价格："+this.price+",出版社："+this.pub;
    }
}
public class Test1_1_3_1 {
    public static void main(String args[]){
        Book12.setPub("北京大学出版社");
        Book12 ba=new Book12("Java开发",10.2);
        Book12 bb=new Book12("Android开发",11.2);
        Book12 bc=new Book12("Oracle开发",12.2);
        System.out.println(ba.getInfo());
        System.out.println(bb.getInfo());
        System.out.println(bc.getInfo());
    }
}
//结果：
//图书名称：Java开发,价格：10.2,出版社：北京大学出版社
//图书名称：Android开发,价格：11.2,出版社：北京大学出版社
//图书名称：Oracle开发,价格：12.2,出版社：北京大学出版社
