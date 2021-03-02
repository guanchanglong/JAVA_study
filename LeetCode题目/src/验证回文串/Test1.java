package 验证回文串;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2021/1/2 17:56
 */
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        String string = str.toUpperCase();
        int j=0;
        for (int i=0;i<string.length()/2;i++){
            if (string.charAt(i)==string.charAt(string.length()-1-i)){
                j++;
            }else{
                return false;
            }
        }
        return j==string.length()/2;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("race a car"));
    }
}
