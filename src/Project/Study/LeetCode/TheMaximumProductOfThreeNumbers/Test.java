package Project.Study.LeetCode.TheMaximumProductOfThreeNumbers;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[1]<0){
            nums[0]=nums[0]*(-1);
            nums[1]=nums[1]*(-1);
        }
        if (nums[0]*nums[1]>nums[nums.length-3]*nums[nums.length-2]){
            return nums[0]*nums[1]*nums[nums.length-1];
        }
        else{
            return nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        }
    }
}
public class Test {
}
