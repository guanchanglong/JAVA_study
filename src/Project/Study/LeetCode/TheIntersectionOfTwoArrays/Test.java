package Project.Study.LeetCode.TheIntersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        Integer[]num = set.toArray(new Integer[]{});
        int[]nums = new int[num.length];
        for (int i=0;i<num.length;i++){
            nums[i]=num[i];
        }
        return nums;
    }
}
public class Test {

}
