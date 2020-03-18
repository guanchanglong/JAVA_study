package com.study.Demo;

class MyMath{
    public static int div(int x,int y)throws Exception{	//此方法不处理异常
        System.out.println("计算开始");
        int result=0;
        try{
            result=x/y;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("计算结束");
        }
        return result;
    }
}
public class Test3 {
    public static void main(String args[]){
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
