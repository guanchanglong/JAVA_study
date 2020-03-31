package Project.Study.BigDecimalClass;

import java.math.BigDecimal;

class MyMath{
    public static double round(double num,int scale){
        BigDecimal big=new BigDecimal(num);
        BigDecimal result= big.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
        return result.doubleValue();
    }
}
public class Test1 {
    public static void main(String[]args){
        System.out.println(MyMath.round(15.5,0));
        System.out.println(MyMath.round(-15.5,0));
        System.out.println(MyMath.round(1168.4344343,4));
    }
}
