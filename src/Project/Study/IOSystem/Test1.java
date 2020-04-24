package Project.Study.IOSystem;

public class Test1 {
    public static void main(String[]args){
        try{
            Integer.parseInt("abc");    //此处一定会发生异常
        }catch (Exception e){
            System.err.println(e);          //错误输出
        }
    }
}
