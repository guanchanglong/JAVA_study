package Project.Study.LeetCode.ConvertToLowercaseLetters;

class Solution {
    public String toLowerCase(String str) {
        char[]s = str.toCharArray();
        for (int i=0;i<s.length;i++){
            if(s[i]<=90&&s[i]>=65){
                s[i]= (char) (s[i]+32);
            }
        }
        String string = String.valueOf(s);
        return string;
    }
}
public class Test {
}
