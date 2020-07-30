package Project.Study.LeetCode.MostOfTheElements;


class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for(int num1 : nums) {
            if(num1 != num) {
                count--;
                if(count == 0) {
                    count = 1;
                    num = num1;
                }
            }
            else {
                count++;
            }
        }
        return num;
    }
}
public class Test {
}
