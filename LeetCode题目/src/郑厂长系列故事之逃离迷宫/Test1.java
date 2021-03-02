package 郑厂长系列故事之逃离迷宫;

import java.util.Scanner;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/2 23:13
 */
//题目：
//贝西喜欢玩桌上扮演游戏（BRPG），所以她说服农场主约翰开车送她到商店，在那里她买了三个骰子。
//这三个骰子分别有S1,S2,S3个面。每个有S面的骰子每一面的点数分别是1,2,3,…,S−1,S。
//贝西每次同时扔出三个骰子，她一直扔呀扔，试图找出三个骰子点数之和哪个出现的次数最多。
//现在给定三个骰子中每个骰子的面数，求三个骰子的点数和哪个最频繁出现。如果有多解，输出最小的一个。
//数据范围：（2≤S1≤20；2≤S2≤20；2≤S3≤40）
//输入格式
//第一行:三个正整数S1,S2,S3。
//输出格式
//一个整数表示最频繁出现的点数和。
//3 2 3
//5
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        if(s3>s1+s2)
            System.out.println(s1+s2+1);
        else if(s2>s1+s3)
            System.out.println(s1+s3+1);
        else if(s1>s3+s2)
            System.out.println(s3+s2+1);
        else
            System.out.println((s1+s2+s3+3)/2);
    }
}
