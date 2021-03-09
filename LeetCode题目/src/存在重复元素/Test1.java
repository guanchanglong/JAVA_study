package 存在重复元素;

import java.util.Arrays;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/9 15:16
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length<2){
            return false;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(nums));
    }
}
