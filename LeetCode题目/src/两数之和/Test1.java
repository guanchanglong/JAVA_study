package 两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/3/15 6:21
 */
class Solution {
    //暴力枚举
//    public int[] twoSum(int[] nums, int target) {
//        int[]nums2 = new int[2];
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    nums2[0] = i;
//                    nums2[1] = j;
//                }
//            }
//        }
//        return nums2;
//    }
    //哈希表两遍循环
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int[]ns = new int[2];
//        for (int i=0;i<nums.length;i++){
//            map.put(nums[i],i);
//        }
//        for (int i=0;i<nums.length;i++){
//            if (map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
//                ns[0] = map.get(target-nums[i]);
//                ns[1] = i;
//            }
//        }
//        return ns;
//    }
    //哈希表一遍循环
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[]ns = new int[2];
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                ns[0] = map.get(target-nums[i]);
                ns[1] = i;
                return ns;
            }else{
                map.put(nums[i],i);
            }
        }
        return ns;
    }

}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]ints = new int[]{3,3};
        int[]nums = solution.twoSum(ints,6);
        for (int n:nums){
            System.out.println(n);
        }
    }
}
