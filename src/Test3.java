public class Test3 {
    public static void main(String args[]){
        //if((1==1)|(10/0)==0){//程序继续往下运行，遇到((10/0)==0)时报错
        //    System.out.println("Hello World");
        //}
        //解决方法
        if((1==1)||(10/0)==0){//程序遇到第一个为判断结果为true即停止，不再继续往下运行
            System.out.println("Hello World");
        }
    }
}
