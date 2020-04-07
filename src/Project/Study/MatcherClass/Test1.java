package Project.Study.MatcherClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[]args){
        String str="100";
        String regex="\\d+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
