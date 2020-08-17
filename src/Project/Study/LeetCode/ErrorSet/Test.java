package Project.Study.LeetCode.ErrorSet;

//利用1~n的和计算
//class Solution {
//    public int[] findErrorNums(int[] nums) {
//        Arrays.sort(nums);
//        int[]num = new int[2];
//        long x=((nums.length+1)*nums.length)/2;
//        for (int i=0;i<nums.length-1;i++){
//            if (nums[i]==nums[i+1]){
//                num[0]=nums[i];
//            }
//            else{
//                x-=nums[i];
//            }
//        }
//        x-=nums[nums.length-1];
//        num[1]=(int)x;
//        return num;
//    }
//}

//数组桶方法
class Solution{
    public int[] findErrorNums(int[] nums) {
        // 用一个布尔数组来代替hash
        boolean[] showed = new boolean[nums.length + 1];
        int[] ans = new int[2];
        for (int num : nums) {
            // 出现了重复的数字 置为1
            if (showed[num]) {
                ans[0] = num;
            }
            else{
                showed[num] = !showed[num];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            // 找到没有出现的那一位
            if (!showed[i]){
                ans[1] = i;
            }
        }
        return ans;
    }
}
public class Test {
}
