class A3{
    String info="Hello";    //定义属性，暂不封装
}
class B3 extends A3{
    int info=100;   //名称相同，发生属性覆盖
    public void print(){
        System.out.println(super.info);
        System.out.println(this.info);
    }
}
public class Test1_1_3_6 {
    public static void main(String args[]){
        B3 b=new B3();  //实例化子类对象
        b.print();
    }
}
//结果：
//Hello
//100
