package Project.Study.LeetCode.OnlyReverseTheLetters;

class Solution {
    public String reverseOnlyLetters(String S) {
        char[]char1 = S.toCharArray();
        String regex="[^a-zA-Z]";
        String str = S.replaceAll(regex,"");//用正则去除不为字母的字符
        char[]char2 = str.toCharArray();
        for (int i=0;i<char2.length/2;i++){ //调换
            char c = char2[i];
            char2[i]=char2[char2.length-1-i];
            char2[char2.length-1-i]=c;
        }
        int j=0;
        for (int i=0;i<char1.length;i++){
            if (Character.isLetter(char1[i])) {//为字母
                char1[i]=char2[j++];
            }
        }
        return String.valueOf(char1);
    }
}
public class Test {
}
