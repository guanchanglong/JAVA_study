
/**
 * 二重循环遍历写法
 */
//class Solution {
//    public String countAndSay(int n) {
//        if (n==1){
//            return "1";
//        }
//        if (n==2){
//            return "11";
//        }
//        if (n==3){
//            return "21";
//        }
//        if (n==4){
//            return "1211";
//        }
//        StringBuilder string = new StringBuilder("111221");
//        StringBuilder s = new StringBuilder();
//        int num=1;
//        for (int i=5;i<n;i++){
//            for (int j=0;j<string.length();j++){
//                if ((j+1)<string.length()&&string.charAt(j)==string.charAt(j+1)){
//                    num++;
//                }
//                else{
//                    s.append(num);
//                    s.append(string.charAt(j));
//                    num=1;
//                }
//            }
//            string.delete(0,string.length());
//            string.append(s.toString());
//            s.delete(0,s.length());
//        }
//        return string.toString();
//    }
//}

/**
 * 递归写法
 */
class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String temp = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        char c = '0';
        int count = 0;
        for(int x = 0 ; x < temp.length() ; x ++){
            if(x == 0){
                c = temp.charAt(x);
                count = 1;
            }else{
                if(temp.charAt(x) == c){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(c);
                    c = temp.charAt(x);
                    count = 1;
                }
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}

public class Test38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(4));
    }
}
