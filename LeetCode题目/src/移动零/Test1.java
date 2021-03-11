package 移动零;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/12 6:58
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        int length = index;
        for (int i=length;i<nums.length;i++){
            nums[i] = 0;
        }
//        for (int n:nums){
//            System.out.print(n+" ");
//        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
    }
}
