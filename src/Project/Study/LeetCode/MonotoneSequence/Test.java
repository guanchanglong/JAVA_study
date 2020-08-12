package Project.Study.LeetCode.MonotoneSequence;


//class Solution {
//    public boolean isMonotonic(int[] A) {
//        int n=0,m=0;
//        for (int i=0;i<A.length-1;i++){
//            if (A[i]>A[i+1]){
//                n++;
//            }
//            else if (A[i]<A[i+1]){
//                n--;
//            }
//            else if (A[i]==A[i+1]){
//                m++;
//            }
//        }
//        if (n<0){
//            n=n*(-1);
//        }
//        return (n+m) == A.length-1;
//    }
//}

class Solution {                            //优于前一种方式
    public boolean isMonotonic(int[] A) {
        boolean grow = (A[0] <= A[A.length - 1]);   //先判断是递增还是递减
        for (int i = 0; i < A.length - 1; i++) {
            if (grow) {                             //递增
                if (A[i] > A[i + 1]) {
                    return false;
                }
            } else {                                //递减
                if (A[i] < A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Test {
    public static void main(String[]args){
        int[]num = new int[]{1,3,1};
        Solution solution = new Solution();
        System.out.println(solution.isMonotonic(num));
    }
}
