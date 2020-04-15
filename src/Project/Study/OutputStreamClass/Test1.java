package Project.Study.OutputStreamClass;

class Net implements AutoCloseable{
    @Override
    public void close()throws Exception {
        System.out.println("资源自动关闭，释放资源");
    }
    public void info()throws Exception {//假设有异常抛出
        System.out.println("...");
    }
}
public class Test1 {
    public static void main(String[]args){
        try(Net net=new Net()) {
            net.info();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
