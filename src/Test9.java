public class Test9 {
    public static void main(String args[]){
        set(100);
        set(3);
    }
    public static void set(int x){
        if(x==3){
            return;//遇到return函数直接结束，后面的步骤不再执行
        }
        System.out.println("x="+x);
    }
}
