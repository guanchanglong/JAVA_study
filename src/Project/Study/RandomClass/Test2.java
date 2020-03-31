package Project.Study.RandomClass;

import java.util.Random;

public class Test2 {
    public static void main(String[]args){
        Random rand=new Random();
        int[] data =new int[7]; //开辟一个7个元素的数组，保存生成数字
        int foot=0;             //数组操作脚标
        while(foot<7){
            int t=rand.nextInt(37);//生成一个不大于37的随机数
            if(!isRepeat(data,t)){  //重复的话就不执行
                data[foot++]=t;     //保存数据
            }
        }
        java.util.Arrays.sort(data);//排序
        for (int datum : data) {
            System.out.print(datum + "、");
        }
    }
    /**
     * 此方法主要是判断是否存在重复内容
     * @param temp 指的是已经保存的数据
     * @param num 新生成的数据
     * @return 如果存在返回true，否则返回false
     */
    public static boolean isRepeat(int[] temp, int num){
        if(num==0){         //没有必要判断了
            return true;    //直接返回，随后的代码都不再执行
        }
        for (int i : temp) {
            if (i == num) {
                return true;//表示后面的数据都不再进行判断
            }
        }
        return false;
    }
}
