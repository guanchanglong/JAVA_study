//若所有元素都不为0， 那么一定可以跳到最后；
//反之则从后往前遍历，如果遇到nums[i] = 0，
// 就找i前面的元素j，使得nums[j] > i - j。
// 如果找不到，则不可能跳跃到num[i+1]，返回false。
//class Solution {
//    public boolean canJump(int[] nums) {
//        int num = 1;
//        if(nums.length==1){
//            return true;
//        }
//        for (int i=nums.length-2;i>=0;i--){
//            //当nums[i]==0的时候，就
//            if (nums[i]>=num){
//                num = 1;
//            }
//            else{
//                num++;
//            }
//            if(i==0&&num>1){
//                return false;
//            }
//        }
//        return true;
//    }
//}

//贪心算法
//若要满足能够到达最后一个位置，那么就需要最后一跳的最大距离加上该位置下标一定要大于等于数组长度,
//即nums[i]+i>=nums.length,而当前元素又一定处于之前元素最远可以达到范围之内
class Solution{
    public boolean canJump(int[] nums){
        if(nums.length<=1){
            return true;
        }
        int m = nums[0];
        for (int i=1;i<nums.length-1;i++){
            //如果跳的步数大于等于现在循环到的长度i，则进行m值的判断交换
            if (i<=m){
                //对m和nums[i]+i进行比较，大的数重新赋值给m
                m = Math.max(m,nums[i]+i);
            }
            //如果循环途中i就大于m了，则一定不能跳到末尾了，直接返回false
            else{
                return false;
            }
        }
        return m>=nums.length-1;
    }
}

public class Test1 {
    public static void main(String[] args) {
        int[]nums = new int[]{1,2,3,2,0,3,4,1,2,0,1,0,3};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }
}
