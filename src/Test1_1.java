public class Test1_1 {
    public static void main(String args[]){
        System.out.println("两个整型参数:"+add(10,20));
        System.out.println("三个整型参数:"+add(10,20,30));
        System.out.println("两个浮点型参数:"+add(10.2,20.3));
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static double add(double x,double y){
        return x+y;
    }
}
