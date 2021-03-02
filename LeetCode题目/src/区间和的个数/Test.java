//
//class Solution {
//    public int countRangeSum(int[] nums, int lower, int upper) {
//        int sum=0;
//        for (int i=0;i<nums . length;i++){
//            long num=0;
//            for (int j=i;j<nums.length;j++){
//                num+=nums[j];
//                if (num>=lower&&num<=upper){
//                    sum++ ;
//                }
//            }
//        }
//        return sum;
//    }
//}
////[-1,-2,-5,1,5,3,4]
//
////1.[-1]
////2.[-1,-2]
////3.[-1,-2,-5]
////4.[-1,-2,-5,1]
////5.[-1,-2,-5,1,5]
////6.[-1,-2,-5,1,5,3]
////7.[-1,-2,-5,1,5,3,4]
//
////8.[-2]
////9.[-2,-5]
////10.[-2,-5,1]
////11.[-2,-5,1,5]
////12.[-2,-5,1,5,3]
////13.[-2,-5,1,5,3,4]
//
////14.[-5]
////15.[-5,1]
////16.[-5,1,5]
////17.[-5,1,5,3]
////18.[-5,1,5,3,4]
//
////19.[1]
////20.[1,5]
////21.[1,5,3]
////22.[1,5,3,4]
//
////23.[5]
////24.[5,3]
////25.[5,3,4]
//
////26.[3]
////27.[3,4]
//
//
//public class Test {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[]nums = new int[]{-1,-2,-5,1,5,3,4};
//        long startTime=System.currentTimeMillis();
//        System.out.println(solution.countRangeSum(nums,3,10));
//        long endTime=System.currentTimeMillis();
//        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
//    }
//}
