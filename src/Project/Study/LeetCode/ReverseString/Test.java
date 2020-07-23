package Project.Study.LeetCode.ReverseString;

class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1,num=0;
        for (int i=0;i<s.length/2;i++){
            if(s[i]-s[j]>=0){
                num=s[i]-s[j];
                s[i]=(char)(s[i]-num);
                s[j]=(char)(s[j]+num);
                j--;
            }
            else if(s[i]-s[j]<0){
                num=s[i]-s[j];
                s[i]=(char)(s[i]-num);
                s[j]=(char)(s[j]+num);
                j--;
            }
        }
        System.out.println(s);
    }
}
public class Test {
}
