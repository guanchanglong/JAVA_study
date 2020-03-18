package Project.Study.LeetCode.IntegerInversion;

class Solution {
    public int reverse(int x) {
        int n[]=new int[15],sum=0,i=0;
        long s1=2147483647,s2=-2147483648,num=1,sum1=0;
        while(x!=0){
            n[i]=x%10;
            x=x/10;
            i++;
        }
        for(int j = 0 ; j < i ; j++){
            num=1;
            for(int k = j ; k < i - 1 ; k++){
                num*=10;
            }
            sum1+=n[j]*num;
        }
        if(sum1>s1||sum1<s2){
            return 0;
        }else {
            sum=(int)sum1;
            return sum;
        }
    }
}
public class Test {
    public static void main(String args[]){
        Solution solution=new Solution();
        System.out.println(solution.reverse(1234567890));
    }
}
/*  7. 整数反转
    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    示例 1:
    输入: 123
    输出: 321

    示例 2:
    输入: -123
    输出: -321

    示例 3:
    输入: 120
    输出: 21
    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
    请根据这个假设，如果反转后整数溢出那么就返回 0。
 */