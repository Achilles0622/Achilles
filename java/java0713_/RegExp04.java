package java0713_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    public static void main(String[] args) {
        String content="hanshunping ハングお韩顺平";
        String regStr="han|韩|寒";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while   (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
