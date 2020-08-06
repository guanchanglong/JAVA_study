package Project.Study.LeetCode.RotateTheArray;

import java.util.Arrays;

class Solution {
    public int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        for (int i=0;i<k;i++){                  //进行k次循环，每次循环数组向后移动一位
            int num=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=num;
        }
        return nums;
    }
}
public class Test {
    public static void main(String[]args){
        int[]nums = new int[]{1,2,3,4,5,6,7};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.rotate(nums, 3)));
    }
}
