package Project.Study.LeetCode.RemoveElements1;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count++]=nums[i];      //原地修改数组
            }
        }
        return count;
    }
}
public class Test {
}
