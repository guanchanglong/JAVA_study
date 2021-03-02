package 破坏回文串;

import java.util.Arrays;

/**
 * @author：小关同学爱吃汉堡
 * @date: 2020/12/22 21:00
 */
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        char[]chars = palindrome.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]!='a'&&i!=chars.length/2){
                chars[i]='a';
                return String.valueOf(chars);
            }
        }
        //如果字符串全为a，则将最后一个字符改为b
        chars[chars.length-1]='b';
        return String.valueOf(chars);
    }
}

public class Test1 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.breakPalindrome("aaa"));
    }
}
