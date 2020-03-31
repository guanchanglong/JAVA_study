package Project.Study.BigIntegerClass;

import java.math.BigInteger;

public class Test1 {
    public static void main(String[]args){
        BigInteger bigA=new BigInteger("123456789013213214214");
        BigInteger bigB=new BigInteger("2324342314132432432");
        System.out.println("加法操作："+bigA.add(bigB));
        System.out.println("减法操作："+bigA.subtract(bigB));
        System.out.println("乘法操作："+bigA.multiply(bigB));
        System.out.println("除法操作："+bigA.divide(bigB));
        BigInteger result[]=bigA.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+",余数："+result[1]);
    }
}
