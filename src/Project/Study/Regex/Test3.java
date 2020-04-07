package Project.Study.Regex;

public class Test3 {
    public static void main(String[]args){
        String str1="101.01";
        String str2="102.10";
        String regex="\\d+(\\.\\d+)?";
        if(str1.matches(regex)){
            System.out.println(Double.parseDouble(str1));
        }
        if(str2.matches(regex)){
            System.out.println(Double.parseDouble(str2));
        }
    }
}
