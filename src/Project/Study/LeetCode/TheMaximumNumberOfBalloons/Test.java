package Project.Study.LeetCode.TheMaximumNumberOfBalloons;

import java.util.Arrays;

class Solution {
    public int maxNumberOfBalloons(String text) {
        char[]chars = text.toCharArray();
        int[]num = new int[]{0,0,0,0,0};
        for (char c:chars) {
            if (c=='b'){
                num[0]++;
            }
            else if (c=='a'){
                num[1]++;
            }
            else if (c=='l'){
                num[2]++;
            }
            else if (c=='o'){
                num[3]++;
            }
            else if (c=='n'){
                num[4]++;
            }
        }
        num[2]=num[2]/2;
        num[3]=num[3]/2;
        Arrays.sort(num);
        return num[0];
    }
}
public class Test {
}
