//import java.util.Arrays;
//
//class Solution {
//    public int maximumGap(int[] nums) {
//        Arrays.sort(nums);
//        if (nums.length>1){
//            int max = nums[1]-nums[0];
//            for (int i=1;i<nums.length-1;i++){
//                int num = nums[i+1]-nums[i];
//                if (num>max){
//                    max = num;
//                }
//            }
//            return max;
//        }
//        else{
//            return 0;
//        }
//    }
//}
//
////[3,6,9,1,7,5,13]
////排序后的代码：1，3，5，6，7，9，13
//public class Test1 {
//    public static void main(String[] args) {
//        int[]nums = new int[]{3,6,9,1,7,5,13};
//        Solution solution = new Solution();
//        int num =  solution.maximumGap(nums);
//        System.out.println(num);
//    }
//}
