package Project.Study.LeetCode.BinarySum;

//遇到超大数不能通过
//class Solution {
//    public String addBinary(String a, String b) {
//        BigInteger x = new BigInteger(a);
//        BigInteger y = new BigInteger(b);
//        int x1=0,x2=1;
//        int y1=0,y2=1;
//        String string = "";
//        if (x%10==1){       //处理0位
//            x1+=1;
//        }
//        if (y%10==1){
//            y1+=1;
//        }
//        x/=10;
//        y/=10;
//        do {
//            if (x != 0) {
//                x2 *= 2;
//                if (x % 10 == 1) {
//                    x1 += x2;
//                }
//                x /= 10;
//            }
//            if (y != 0) {
//                y2 *= 2;
//                if (y % 10 == 1) {
//                    y1 += y2;
//                }
//                y /= 10;
//            }
//        } while (x != 0 || y != 0);
//        long sum = x1+y1;
//        int[]chars = new int[1000];
//        int i=0;
//        while (sum!=0){
//            chars[i++]+=sum%2;
//            sum/=2;
//        }
//        for (int j=i-1;j>=0;j--){
//            string+=chars[j];
//        }
//        if (i==0){
//            string+="0";
//            return string;
//        }
//        return string;
//    }
//}

//用二进制的加减法做的，直接用字符串进行加减
class Solution {
    public String addBinary(String a, String b) {
        char[]a1=a.toCharArray();
        char[]b1=b.toCharArray();
        char[]sum = new char[1000];
        int k=0;
        if (a.length()>=b.length()){
            char[]x = a.toCharArray();
            char[]y = a.toCharArray();
            for (int i=0;i<a.length();i++){
                if (i<(a.length()-b.length())){
                    y[i]='0';
                }
                else{
                    y[i]=b1[i-(a.length()-b.length())];
                }
            }
            for (int i=a.length()-1;i>=0;i--) {
                if (x[i] == '1' && y[i] == '0') {
                    if (sum[k] != '1') {
                        sum[k] = '1';
                    } else {              //进一过
                        sum[k] = '0';
                        sum[k + 1] = '1';
                    }
                } else if (x[i] == '0' && y[i] == '1') {
                    if (sum[k] != '1') {
                        sum[k] = '1';
                    } else {              //进一过
                        sum[k] = '0';
                        sum[k + 1] = '1';
                    }
                } else if (x[i] == '0' && y[i] == '0') {
                    if (sum[k] != '1') {
                        sum[k] = '0';
                    } else {              //进一过
                        sum[k] = '1';
                    }
                } else if (x[i] == '1' && y[i] == '1') {
                    if (sum[k] != '1') {
                        sum[k] = '0';
                    } else {
                        sum[k] = '1';
                    }
                    sum[k + 1] = '1';
                }
                k++;
            }
        }else{                          //b.length()>a.length()
            char[]x = b.toCharArray();
            char[]y = b.toCharArray();
            for (int i=0;i<b.length();i++){
                if (i<(b.length()-a.length())){
                    x[i]='0';
                }else{
                    x[i]=a1[i-(b.length()-a.length())];
                }
            }
            for (int i=b.length()-1;i>=0;i--) {
                if (x[i] == '1' && y[i] == '0') {
                    if (sum[k] != '1') {
                        sum[k] = '1';
                    } else {              //进一过
                        sum[k] = '0';
                        sum[k + 1] = '1';
                    }
                } else if (x[i] == '0' && y[i] == '1') {
                    if (sum[k] != '1') {
                        sum[k] = '1';
                    } else {              //进一过
                        sum[k] = '0';
                        sum[k + 1] = '1';
                    }
                } else if (x[i] == '0' && y[i] == '0') {
                    if (sum[k] != '1') {
                        sum[k] = '0';
                    } else {              //进一过
                        sum[k] = '1';
                    }
                } else if (x[i] == '1' && y[i] == '1') {
                    if (sum[k] != '1') {
                        sum[k] = '0';
                    } else {
                        sum[k] = '1';
                    }
                    sum[k + 1] = '1';
                }
                k++;
            }
        }
        int h=0;
        for (int i=0;i<sum.length;i++){
            if (sum[i]!='\u0000'){
                h++;
            }else{
                break;
            }
        }
        char[]sum1 = new char[h];
        int m=0;
        for (int i=k;i>=0;i--){
            if (sum[i]!='\u0000'){
                sum1[m++]=sum[i];
            }
        }
        if (a.length()==0&&b.length()==0){
            return String.valueOf('0');
        }
        return String.valueOf(sum1);
    }
}
public class Test {
    public static void main(String[]args){
        String a = "0";
        String b = "0";
        Solution solution = new Solution();
        System.out.println(solution.addBinary(a,b));
    }
}
