package Project.Study.FileClass;

import java.io.File;

public class Test5 {
    public static void main(String[]args){
        File file=new File("d:"+File.separator);    //定义操作路径
        print(file);                                           //列出目录
    }

    /**
     * 列出目录结构，此方法采用递归调用方式
     * @param file 要列出目录的路径
     */
    public static void print(File file){
        if (file.isDirectory()){            //路径为目录
            File[]result=file.listFiles();  //列出子目录
            if (result!=null){              //目录可以列出
                for (File x:result) {
                    print(x);               //递归调用
                }
            }
        }
        System.out.println(file);           //直接输出完整路径
    }
}
//结果：
//d:\vs2013\Common7\Tools\2052\vcupgradeui.dll
//d:\vs2013\Common7\Tools\2052
//d:\vs2013\Common7\Tools\errlook.exe
//d:\vs2013\Common7\Tools\errlook.hlp
//d:\vs2013\Common7\Tools\guidgen.exe
//d:\vs2013\Common7\Tools\makehm.exe
//d:\vs2013\Common7\Tools\ProjectComponents\Microsoft.Collections.Immutable.dll
//...
