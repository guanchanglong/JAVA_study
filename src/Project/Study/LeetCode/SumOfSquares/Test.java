package Project.Study.LeetCode.SumOfSquares;

//超时
//class Solution {
//    public boolean judgeSquareSum(int c) {
//        if (c==1||c==2||c==4||c==5||c==8){
//            return true;
//        }
//        for(int i=1;i<=c/2;i++){
//            for (int j=c/2;j>=0;j--){
//                if (i*i+j*j==c){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=2){
            return true;
        }
        int left = 0;
        int right = (int)Math.pow(c,0.5);
        while(left<=right){
            int sum = left*left + right*right;
            if(sum==c){
                return true;
            }
            if(sum<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
public class Test {
    public static void main(String[]args){
        Solution solution = new Solution();
        int c=9;
        System.out.println(solution.judgeSquareSum(c));
    }
}
