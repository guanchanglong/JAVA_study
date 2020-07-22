package Project.Study.LeetCode.TheDifferenceBetweenTheSumOfTheIndividualProductsOfIntegers;

class Solution {
    public int subtractProductAndSum(int n) {
        int sum1=0,sum2=0;
        if (n==0){
            return 0;
        }
        while(n!=0){
            sum1+=n%10;
            sum2*=n%10;
            n=n/10;
        }
        return sum2-sum1;
    }
}
public class Test {

}
