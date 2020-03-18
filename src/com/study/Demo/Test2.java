package com.study.Demo;

public class Test2 {
    public static void main(String args[]){
        System.out.println("1.除法计算开始");
        try {
            int x=Integer.parseInt(args[0]);    //接收参数并且转型
            int y=Integer.parseInt(args[1]);    //接收参数并且转型
            System.out.println("2.除法计算："+(x/y));   //此处产生异常
            //异常产生之后的语句将不再执行，此处在try中产生异常，所以下面的输出不会执行
            System.out.println("666");
        }catch (Exception e) {   //处理所有的异常类型
            e.printStackTrace();
        } finally {
            System.out.println("不管是否出现异常我都执行！");
        }
        System.out.println("3.除法计算结束");
    }
}
//结果
//1.除法计算开始
//不管是否出现异常我都执行！
//3.除法计算结束
//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//	at com.study.Demo.Test2.main(Test2.java:7)