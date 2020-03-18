public class Test1_1_5_1 {
    public static void main(String args[]){
      F f=new F();
      f.test();
    }
    void test(){
        System.out.println("666");
    }
}
class F extends Test1_1_5_1{
    void test(){
        super.test();
        System.out.println("2333");
    }
}