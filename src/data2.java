public class data2 {//浮点数
    //java中只要是小数，对应的默认数据类型就是double型数据(double是保存范围最广的数据类型)
    public static void main(String args[]){
        double num1 = 10.2 ;
        System.out.println(num1*2);

        float num2 = 11.3f ;//表示float数据类型的话，小数后面要加上f/F，不加的话会报错，因为编译器默认该小数为double类型
        float num3 = (float)11.43 ;//强制类型转化为float类型数据
        System.out.println(num2*num3);//计算小数的bug，计算结果并不会得到129.159，而会得到129.15901

        int num4 = 9 ;
        int num5 = 5 ;
        System.out.println(num4/num5);//只有double和float类型才能保存小数
        //解决方法
        System.out.println(num4/(double)num5);
    }
}
