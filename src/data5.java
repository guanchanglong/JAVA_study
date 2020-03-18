public class data5 {//String型数据
    //String属于引用数据类型(它属于一个类，在java里面只要是类名称，每个单词的首字母都是大写的)，但是这个类的使用比较特殊
    //String表示的是一个字符串
    public static void main(String args[]){
        String str = "Hello World" ;//str是字符串变量
        System.out.println(str);

        str = str + "!!!" ;//可以使用'+'进行字符串的连接
        System.out.println(str);

        int num1 = 100 ;
        int num2 = 99 ;
        String str2 = "加法计算：" + num1 + num2 ;//可以由结果知道num1和num2直接变为字符串类型，没有进行算数加法操作
        System.out.println(str2);
        //解决方法
        String str3 = "加法计算：" + (num1 + num2) ;
        System.out.println(str3);
    }
}
