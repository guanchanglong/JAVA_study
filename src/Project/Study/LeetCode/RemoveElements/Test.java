package Project.Study.LeetCode.RemoveElements;
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n=0;
        int count=0;
        for (int x:nums
        ) {
            if(x==val){
                n++;
            }
        }
        for(int i=0;i<nums.length-1;i++){   //删除重复出现的元素
            if(nums[i] != nums[i+1])
                nums[++count] = nums[i+1];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==val){
                nums[j]=nums[j+1];
            }
        }
        return (nums.length-n);
    }
}
public class Test {
}
