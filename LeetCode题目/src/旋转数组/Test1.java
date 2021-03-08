package 旋转数组;

import java.util.Arrays;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/3 21:37
 */
class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reversal(nums,0,nums.length,nums.length/2);
        reversal(nums,0,k,k/2);
        reversal(nums,k,nums.length,(nums.length-k)/2);
    }

    //先全部进行一次反转
    public void reversal(int[]nums,int start,int end,int num){
        for (int i=0;i<num;i++){
            int n = nums[start];
            nums[start] = nums[end-1];
            nums[end-1] = n;
            start++;
            end--;
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{1,2,3,4,5,6,7};
        solution.rotate(nums,3);
    }
}
