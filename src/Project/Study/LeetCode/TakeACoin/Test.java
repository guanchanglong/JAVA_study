package Project.Study.LeetCode.TakeACoin;

class Solution {
    public int minCount(int[] coins) {
        int num=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]%2!=0){
                num+=coins[i]/2+1;
            }
            else{
                num+=coins[i]/2;
            }
        }
        return num;
    }
}
public class Test {
}
