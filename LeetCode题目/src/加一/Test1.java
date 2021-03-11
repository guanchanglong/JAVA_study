package 加一;

import java.util.Arrays;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/10 21:39
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int[]nums = new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0){
                return digits;
            }
        }
        nums[0] = 1;
        //该方法的作用是拷贝数组
        //里面的参数构成System.arraycopy(原数组，原数组的起始位置，目标数组，目标数组的起始位置，要拷贝的数组长度);
        System.arraycopy(digits, 0, nums, 1, digits.length);
        return nums;
    }
}
//999
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{2,9,9,9};
        solution.plusOne(nums);
    }
}
