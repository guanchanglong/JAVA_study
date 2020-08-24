package Project.Study.LeetCode.ThePowerOf4;

//根据数学公式： log(4^n)=n*log(4)得
//当num为4的幂时，n肯定为整数
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num<=0){
            return false;
        }
        double n=Math.log(num)/Math.log(4);//换底公式
        return (int)n*Math.log(4)==Math.log(num);
    }
}
public class Test {
    public static void main(String[]args){
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(63));
    }
}
