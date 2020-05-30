package Project.Study.LeetCode.AValidAlphabeticEctopicWord;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            //先将String类型转换成char数组
            char[]a = s.toCharArray();
            char[]b = t.toCharArray();
            //进行字符排序
            Arrays.sort(a);
            Arrays.sort(b);
            //比较两个字符数组是否相同，若相同则为字母异位词
            return Arrays.equals(a,b);
        }
    }
}
public class Test {
    public static void main(String[]args){
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s,t));
    }
}
