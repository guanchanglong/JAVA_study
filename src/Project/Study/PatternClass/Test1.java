package Project.Study.PatternClass;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[]args){
        String str="hello3232world32!!!";
        String regex="\\d+";
        Pattern pattern=Pattern.compile(regex);
        String[] result =pattern.split(str);
        System.out.println(Arrays.toString(result));
    }
}
