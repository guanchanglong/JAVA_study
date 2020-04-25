package Project.Study.LeetCode.ANumberThatAppearsOnlyOnce;
class Solution {
    public int singleNumber(int[] nums) {
        boolean[] a=new boolean[nums.length];
        int i=0,n=0;
        for (int x=0;x<nums.length;x++){
            n=0;
            for (int y=0;y<nums.length;y++){
                if (nums[x]==nums[y]){
                   n++;
                }
            }
            if (n<=1){
                a[x]=true;
            }
        }
        for(i=0;i<nums.length;i++){
            if(a[i]){
                break;
            }
        }
        return nums[i];
    }
}
class Solution1{
    public int singleNumber(int[] nums) {
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        return a;
    }
}
public class Test {
    public static void main(String[]args){
        int[]nums=new int[]{4,1,2,1,2};
        Solution solution=new Solution();
        Solution1 solution1=new Solution1();
        System.out.println(solution.singleNumber(nums));
        System.out.println(solution1.singleNumber(nums));
    }
}
