package Project.Study.LeetCode.ThePowerOf3;

class Solution {
    public boolean isPowerOfThree(int n) {
        int i=0;
        if (n==0){
            return false;
        }
        while (true){
            if (n==Math.pow(3,i)){
                return true;
            }
            else if (Math.pow(3,i)>n){
                return false;
            }
            i++;
        }
    }
}
public class Test {
}
