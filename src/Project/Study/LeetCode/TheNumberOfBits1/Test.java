package Project.Study.LeetCode.TheNumberOfBits1;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum=0;
        if (n==0){
            return 0;
        }
        while(n!=0){
            sum+=n&1;
            n>>>=1;     //">>>"表示无符号右移
        }
        return sum;
    }
}
public class Test {
}
