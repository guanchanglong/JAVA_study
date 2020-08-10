package Project.Study.LeetCode.TheSquareOfAnOrderedArray;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
public class Test {
    public static void main(String[]args){
        int[]num = new int[]{-4,-1,0,3,10};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(num)));
    }
}
