package Project.Study.LeetCode.InWineProblem;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int num,sum = numBottles,n=0;
        while(true){
            num=numBottles/numExchange;     //第一次兑换的酒
            n=numBottles-num*numExchange;
            if ((n+num)>=numExchange){      //如果剩下的酒能继续兑换
                sum+=num;
                numBottles=n+num;
            }
            else {
                sum+=num;
                return sum;
            }
        }
    }
}
public class Test {

}
