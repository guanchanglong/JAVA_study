package Project.Study.LeetCode.TheMissingNumber;

class Solution {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        for (int x:nums
             ) {
            sum=sum-x;
        }
        return sum;
    }
}
public class Test {
    public static void main(String[]args){
        int []nums = new int[]{9,6,4,2,3,5,7,0,1};
        int x;
        Solution solution = new Solution();
        x = solution.missingNumber(nums);
        System.out.println(x);
    }
}
