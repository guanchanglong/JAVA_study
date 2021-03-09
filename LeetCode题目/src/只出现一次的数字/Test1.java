package 只出现一次的数字;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/9 15:35
 */
class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int n:nums){
            num = num^n;
        }
        return num;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{2,1,2};
        System.out.println(solution.singleNumber(nums));
    }
}
