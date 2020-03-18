package com.study.Demo;

class AddException extends Exception{
    public AddException(String msg){
        super(msg);
    }
}
public class Test5 {
    public static void main(String args[]){
        int num=20;
        try{
            if(num>10){
                throw new AddException("数值传递的过大");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
//结果
//com.study.Demo.AddException: 数值传递的过大
//	at com.study.Demo.Test5.main(Test5.java:13)