package Project.Study.LeetCode.ValidParenthesis;

class Solution {
    public boolean isValid(String s) {
        char [] str = s.toCharArray();//toCharArray是将String对象的每一个下标位的对象保存在char[]中。
        char [] str1 = new char[100];
        int i=0,j=0,n=0,m=0,num=0;
        for(i=0;i<str.length;i++){

        }
        if(i%2==0){
            return false;
        }
        else{
            for(i=0;i<str.length;i++){
                if(str[i]=='('||str[i]=='['||str[i]=='{'){
                    if(n==0){
                        j=i;
                    }
                    n++;
                    switch (str[i]){
                        case '(':
                            str1[i]=')';break;
                        case '[':
                            str1[i]=']';break;
                        case '{':
                            str1[i]='}';break;
                        default:return false;
                    }
                }
                else{                       //当出现相应的闭合符号时
                    num++;
                    for(int x=n-1;x>=j;x--){
                        if(str1[x]==str[i++]){
                            m++;
                        }
                    }
                    if(m==n){       //证明都对应上了
                        n=0;        //重新开始计数
                        num--;
                    }
                }
            }
        }
        if(num==0&&n==0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Test {
}
