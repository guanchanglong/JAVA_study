public class data {//整型数据
    public static void main(String args[]){
        int num = 10 ;
        int result = num*10 ;
        System.out.println(result);
        int max = Integer.MAX_VALUE ; //int类型的最大值
        int min = Integer.MIN_VALUE ; //int类型的最小值
        System.out.println(max);
        System.out.println(min);
        System.out.println(max+1); //最大值+1，超过int类型的保存范围，出现循环操作重新变为int类型的最小值
        System.out.println(min-1); //同理最小值-1，超过int类型的保存范围，出现循环操作重新变为int类型的最大值
        //int 变量 +或- long 型常量 = long 型数据
        System.out.println(max+3L);//数字后加上"L"表示long型常量
        System.out.println(min-(long)1);
        //long 变量 +或- int 型常量 = long 型数据
        System.out.println((long)min-1); //(long)min为强制类型转换，由int型转换为long型
        //在实际开发过程中，强制类型转换可能会造成数据精度丢失以及数据功能性的破坏
        byte num2 = 100 ; //使用变量前必须设置变量值，否则会出现错误
        System.out.println(num2);
    }
}
