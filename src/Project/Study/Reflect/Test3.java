package Project.Study.Reflect;

public class Test3 {
    public static void main(String[]args){
        Class<?>cls=java.util.Date.class;   //通过类名称取得Class类对象
        System.out.println(cls.getName());  //直接对象所在类的名称
    }
}
