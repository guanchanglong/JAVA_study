package Project.Study.LeetCode.MergeTwoOrderedArrays;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //将数组nums2复制到nums1中，"0"表示从数组nums2下标为0的地方开始复制，"m"表示从数组nums1下标为m的地方将nums2复制的内容粘贴上去
        System.arraycopy(nums2,0,nums1,m,nums2.length);
        Arrays.sort(nums1);
    }
}
public class Test {
}
