package Project.Study.Regex;

public class Test4 {
    public static void main(String[]args){
        String str1="192.168.1.1";
        String str2="192.1683.1.1";
        String regex1="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String regex2="(\\d{1,3}\\.){3}\\d{1,3}";
        System.out.println(str1.matches(regex1));
        System.out.println(str1.matches(regex2));
        System.out.println(str2.matches(regex1));
        System.out.println(str2.matches(regex2));
    }
}
