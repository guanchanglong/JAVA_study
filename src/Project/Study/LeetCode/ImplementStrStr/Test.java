package Project.Study.LeetCode.ImplementStrStr;

class Solution {
    public int strStr(String haystack, String needle) {
        char[]a = haystack.toCharArray();
        char[]b = needle.toCharArray();
        int num=0,j=0,i=0,k=0;
        int[]n = new int[a.length];
        if (b.length==0){
            return 0;
        }
        else if (a.length==0){
            return -1;
        }
        for (i=0;i<a.length;i++){
            if (a[i]==b[0]){
                n[k++]=i;
            }
        }
        k=0;
        j=n[0];
        for (i=0;i<b.length;i++){
            for (;j<a.length;j++){
                if (a[j]==b[i]){
                    num++;
                    j++;
                    break;
                }
                else if (a[j]!=b[i]&&num>0){
                    num=0;
                    i=0;
                    j=n[++k]-1;
                    if (j==-1){
                        return -1;
                    }
                }
            }
            if (num==b.length){
                return j-num;
            }
            else if(j==a.length){
                break;
            }
        }
        return -1;
    }
}
public class Test {
    public static void main(String[]args){
        String str1 = "mississippi";
        String str2 = "sippj";
        Solution solution = new Solution();
        System.out.println(solution.strStr(str1,str2));
    }
}