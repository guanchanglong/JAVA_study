package 买卖股票的最佳时机2;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/2 22:45
 */
//贪心的思想
//每一步都得出了当前的最大值
class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        if (prices.length==0){
            return 0;
        }
        for (int i=0;i<prices.length-1;i++){
            //有利润的时候则执行
            if (prices[i]<prices[i+1])
                sum = sum+prices[i+1]-prices[i];
        }
        return sum;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{7,1,5,3,6,4};
        System.out.println(solution.maxProfit(nums));
    }
}
