package Project.Study.LeetCode.CountPrimeNumbers;

class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        int i, sum = 0;
        for (i = 2; i < n; i++) {
            prime[i] = true;
        }
        for (i = 2; i <= n; i++) {
            if (prime[i]) {
                for (int j = i + i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (prime[j]) {
                sum++;
            }
        }
        return sum;
    }
}
public class Test {
    public static void main(String[]args){
        Solution solution=new Solution();
        System.out.println(solution.countPrimes(10));
    }
}
