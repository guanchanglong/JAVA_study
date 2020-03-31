package Project.Study.MathClass;

public class Test2 {
    public static void main(String[]args){
        System.out.println(round(-15.678139,2));
    }
    /**
     * 四舍五入操作，可以保留指定长度的小数位数
     * @param num 要进行四舍五入操作的数字
     * @param scale 保留的小数位
     * @return 四舍五入后的数据
     */
    public static double round(double num,int scale){
        //Math.pow()的方法作用是进行10的N次方的计算
        return Math.round(num*Math.pow(10.0,scale))/Math.pow(10.0,scale);
    }
}
