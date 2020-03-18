public class Test1_1_2_3 {
    public static void main(String args[]){
            String str = "hello";
        System.out.println(initcap(str));
    }
    public static String initcap(String temp){
        return temp.substring(0,1).toUpperCase()+temp.substring(1);
    }
}
