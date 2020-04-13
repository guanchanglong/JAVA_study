package Project.Study.LeetCode.TheLengthOfTheLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        String []string=s.split("");
        int x=0,y=0;
        for (String str:string
             ) {
            x++;
            if(str.equals(" ")){
                y++;
            }
        }
        if(x==y){
            return 0;
        }else{
            String[]str=s.split(" ");
            return str[str.length-1].length();
        }
    }
}
public class Test {
    public static void main(String[]args){
        String str="     dssd";
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLastWord(str));
    }
}
