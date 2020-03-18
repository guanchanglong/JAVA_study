package Project.Study.Genericity;

public class Test4 {
    public static void main(String [] args){
        String str=fun("HelloWorld");
        System.out.println(str.length());
    }

    /**
     * 此方法为泛型方法，T的类型由传入的参数类型决定
     * 必须在方法返回值前明确定义泛型标记
     * @param t 参数类型，同时也决定了返回值类型
     * @param <T>
     * @return  直接返回设置进来的内容
     */
    public static <T>T fun(T t){
        return t;
    }
}
