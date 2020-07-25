package Project.Study.LeetCode.BinarySearch;

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int num = Arrays.binarySearch(nums, target);    //二分检索函数(先对数组进行排序，再进行二分查找)
        if (num>=0)
            return num;
        else
            return -1;
    }
}
public class Test {
}
