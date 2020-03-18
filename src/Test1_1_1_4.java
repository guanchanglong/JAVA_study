public class Test1_1_1_4 {
    public static void main(String args[]){
     String str = "123456789";
     if(isNumber(str)){
         System.out.println("该字符串由数字组成");
     }
     else{
         System.out.println("该字符串由非数字组成");
     }
    }
    public static boolean isNumber(String temp){
        char[]data = temp.toCharArray();
        for (int x=0;x<data.length;x++){
            if(data[x]>'9'||data[x]<'0'){
                return false;
            }
        }
        return true;
    }
}
