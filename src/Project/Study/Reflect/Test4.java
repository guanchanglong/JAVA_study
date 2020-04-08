package Project.Study.Reflect;

public class Test4 {
    public static void main(String[]args) throws Exception {
        //此处直接传递了一个要进行反射操作类的完整名称，是用字符串定义的
        Class<?>cls=Class.forName("java.util.Date");
        System.out.println(cls.getName());          //直接对象所在类的名称
    }
}
//结果：
//java.util.Date