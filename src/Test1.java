public class Test1 {
    public static void main(String args[]){
        int num1 = 10 ;
        int num2 = 20 ;
        int max =num1>num2?num1:num2;
        System.out.println(max);
        //用if-else语句也可以做到三目运算的效果
        if(num1>num2) {
            max=num1;
        }
        else {
            max = num2;
        }
        System.out.println(max);
    }
}