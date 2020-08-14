package com;

public class Bean1 {
    //必须提供无参的构造函数，系统有默认无参构造函数
    public Bean1(){
        System.out.println("对象创建了");
    }
    public void init(){
        System.out.println("对象初始化");
    }
    public void destroy(){
        System.out.println("对象销毁");
    }
}
