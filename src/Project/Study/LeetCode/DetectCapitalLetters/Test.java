package Project.Study.LeetCode.DetectCapitalLetters;

class Solution {
    public boolean detectCapitalUse(String word) {
        char[]chars = word.toCharArray();
        int x=0,y=0;
        if (chars[0]<97){                       //首字母为大写字母
            for (int i=1;i<chars.length;i++){   //判断其后的是否全为小写或大写
                if (chars[i]<97){               //字母为大写字母
                    x++;
                }else{                          //字母为小写字母
                    y++;
                }
            }
            if (x==chars.length-1||y==chars.length-1){
                return true;
            }else {
                return false;
            }
        }
        else{                                   //首字母为小写字母
            for (int i=0;i<chars.length;i++){
                if (chars[i]<97){
                    return false;
                }
            }
            return true;
        }
    }
}
public class Test {
}
