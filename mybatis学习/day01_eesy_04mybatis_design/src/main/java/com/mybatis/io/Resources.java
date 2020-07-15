package com.mybatis.io;

import java.io.InputStream;

/**
 * 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        //分三步进行
        //第一步（Resources.class）拿到当前类的字节码
        //第二步（class.getClassLoader()）获取这个字节码的类加载器
        //第三步（getResourceAsStream(filePath)）根据这个类加载器来读取这个配置
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
