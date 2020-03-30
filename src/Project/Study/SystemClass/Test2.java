package Project.Study.SystemClass;

class Human{
    public Human(){
        System.out.println("一个健康的孩子出生了");
    }
    protected void finalize()throws Throwable{
        System.out.println("修仙活了200年，到时候了");
        throw new Exception("此处即使抛出异常对象也不会产生任何影响");
    }
}
public class Test2 {
    public static void main(String[]args){
        Human men=new Human();
        men=null;
        System.gc();
    }
}
