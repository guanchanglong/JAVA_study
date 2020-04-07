package Project.Study.Regex;

public class Test1 {
    public static void main(String[]args){
        String str="hel12l32o232121wQo@#rl32d!!!";
        String regex="[^a-z]";
        System.out.println(str.replaceAll(regex,""));
    }
}
