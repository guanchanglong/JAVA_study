package Project.Study.LeetCode.InputOrderedArray;

class Solution {
    public int[] twoSum(int[] numbers, int target) {            //二分查找(适用于有序数组)
        int[]num = new int[2];
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;         //设置左节点、右节点
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    num[0] = i+1;
                    num[1] = mid+1;
                    return num;
                }
                else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
        }
        return num;
    }
}
public class Test {

}
