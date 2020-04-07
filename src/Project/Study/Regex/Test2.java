package Project.Study.Regex;

public class Test2 {
    public static void main(String[]args){
        String str="hello0world3!!!";
        String regex="\\d+";
        String[] result =str.split(regex);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
