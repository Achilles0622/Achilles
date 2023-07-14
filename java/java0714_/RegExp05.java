package java0714_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {
    public static void main(String[] args) {

        String content = "111111111aaahelo";
       //// String regStr="a{3}";
        //String regStr="1{4}";
       // String regStr="\\d{2}";
        String regStr="\\d{2,5}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
        }
    }
}
