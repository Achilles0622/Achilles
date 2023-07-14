package java0713_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    public static void main(String[] args) {
        String content="a11c8";
        //String  regStr="[a-z]";
       // String  regStr="[A-Z]";
        String regStr="[abc]";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while   (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
