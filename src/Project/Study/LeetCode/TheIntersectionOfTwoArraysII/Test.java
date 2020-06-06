package Project.Study.LeetCode.TheIntersectionOfTwoArraysII;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);         //先将数组排序
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;){
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {            //nums1[i]==nums2[j]
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {//将集合转变为数组
            res[i] = list.get(i);
        }
        return res;
    }
}
public class Test {
    public static void main(String[]args){
        int[]num1 = new int[]{2,4,4,5,5,2};
        int[]num2 = new int[]{3,2,4,4,4,5,7,5,2};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(num1, num2)));
    }
}
