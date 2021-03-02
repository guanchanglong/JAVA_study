package 掷骰子;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/2 23:12
 */
import java.util.Scanner;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/2 16:49
 */
//　　郑厂长没变
//　　还是那个假厂长真码农
//　　改变的是业余爱好
//　　他现在不研究象棋，改玩游戏了！
//　　
//　　最近，郑厂长爱上了逃离迷宫这个游戏，他日日夜夜的玩，就是想达到自己的目标：1000万，因为这个数字和他在腾讯的年收入一样多。
//　　不过，在他跑到9999999时，游戏屏幕上突然出现了好多箱子，郑厂长必须要消除所有这些箱子才能继续玩游戏。这些箱子排成一行，每个箱子上都有个数字，每个数字代表这个箱子需要被点击的次数才会消失。每个箱子被点击时对应数字会减1，并且他右边箱子的数字也会同时减1，当箱子数字变成0，则其就就消失了。需要说明的是，如果右边没有箱子或者右边的箱子已经消失了，则无法操作当前的箱子（以上所说的“右边”只是指紧挨着的右边，隔开的不算）。
//　　现在已知这些箱子的信息，请问郑厂长是否能成功消除所有的箱子然后继续达成他的千万梦想呢？
//输入首先包含一个正整数T，表示有T组测试样例；
//每组样例有两行，第一行是一个整数n，代表有n个箱子；第二行有n个数字ai，代表每个箱子需要被点击的次数。
//
//[Technical Specification]
//T<=100
//1 <= n <= 10 ^ 6
//0 <= ai <= 10 ^ 9 （1 <= i <= n）
//对于每个样例，如果郑厂长能成功消除这些箱子成功逃脱，请输出"yeah~ I escaped ^_^"，否则就输出"I will never go out T_T"。
//测试用例：
//2
//2
//2 2
//2
//1 2
//结果:
//yeah~ I escaped ^_^
//I will never go out T_T
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i=0;i<num;i++){
            int[]nums = new int[input.nextInt()];
            for (int j=0;j<nums.length;j++){
                nums[j] = input.nextInt();
            }
            int n = nums[0];
            int next;
            for (int j=1;j<nums.length;j++){
                next = nums[j]-n;
                n = next;
                if (j!=nums.length-1&&n<0){
                    break;
                }
            }
            if (n!=0){
                System.out.println("I will never go out T_T");
            }else{
                System.out.println("yeah~ I escaped ^_^");
            }
        }
    }
}
