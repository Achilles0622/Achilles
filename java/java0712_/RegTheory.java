package java0712_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {
    public static void main(String[] args) {
        String content="jnfsnkfdsnfdjngiernginekkdfgnkdfnk1998iwnei " +
                "gmlkgsml2001kmlfsmkfm13124239493jkngkdfngjdkfnkg2002";
        String regStr="\\d\\d\\d\\d";
        Pattern pattern= Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
