package Project.Study.LeetCode.ThereAreRepeatingElements;

import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);//利用Set类的数据不允许重复的特性来判断是否有重复的数字
        }
        if (hashSet.size() == nums.length) {//如果两者长度一致，证明没有重复的数字
            return false;
        }
        else {//否则就有重复的数字
            return true;
        }
    }
}
public class Test {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);//利用Scanner类输入数组
        Solution solution = new Solution();
        String[]str = scanner.nextLine().split(" ");//以空格为分隔
        int[]num=new int[str.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(String.valueOf(num[i]));
        }
        System.out.println(solution.containsDuplicate(num));
        scanner.close();
    }
}
