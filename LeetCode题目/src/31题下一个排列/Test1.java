import java.util.Arrays;

/**
 * 题目理解：刚看到这个题还是很懵皮的，题意大致为求出所给数组组成的数字的下一个比它大的数组，
 *          在原地修改，即不能创建额外的空间
 * 如： 123——132
 *     231——321
 *     213——231
 *     321——123(当)
 * 思路：既然是求比它大的下一个数(刚好比它大)，那就从后往前循环找出那个比前一位(i-1)小的数(i)，
 *      对前面已经循环过的(从i~nums.length)的数进行排序，再对i~nums.length范围内的数进行查找，
 *      找出刚好比i-1下标的的数大一位的数(j)，再将下标为i-1和下标为j的数进行交换(刚好满足了原地修改的条件)
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int target=0,num=0;
        for (int i=nums.length-1;i>0;i--){
            if (nums[i]<=nums[i-1]){
                target++;
            }
            else{
                Arrays.sort(nums,i,nums.length);
                for(int j=i;j<=nums.length-1;j++){
                    if (nums[j]>nums[i-1]){
                        num = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = num;
                        return;
                    }
                }
            }
        }
        if(target==nums.length-1){           //最大的情况
            Arrays.sort(nums);
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        int[]num = new int[]{1,2,3};
        Solution solution = new Solution();
        solution.nextPermutation(num);
        for (int n:num
        ) {
            System.out.print(n);
        }
    }
}
