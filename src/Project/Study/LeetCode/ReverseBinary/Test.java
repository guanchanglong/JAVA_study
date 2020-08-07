package Project.Study.LeetCode.ReverseBinary;


class Solution{
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            num = (num << 1) + (n & 1); //(n & 1)按位与(只有当两者的二进制位都为一结果才为一)，判断n上的二进制位是否为一
            n >>= 1;
        }
        return num;
    }
}
public class Test {
    public static void main(String[]args){
        int n= -3;
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(n));
    }
}
