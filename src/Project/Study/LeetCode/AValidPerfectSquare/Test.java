package Project.Study.LeetCode.AValidPerfectSquare;

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2){
            return true;
        }
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
            if (x * x == num) {
                return true;
            }
        }
        return false;
    }
}
public class Test {
}
