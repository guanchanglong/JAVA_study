package Project.Study.LeetCode.RepeatNTimes;

class Solution {
    public int repeatedNTimes(int[] A) {
        for(int i=0;i<A.length-2;i++){
            if(A[i]==A[i+1]||A[i]==A[i+2]){ //由题意可知，只有一个元素是重复的，找出该重复元素即可
                return A[i];
            }
        }
        return A[A.length-1];
    }
}
public class Test {
}
