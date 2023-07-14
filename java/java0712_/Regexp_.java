package java0712_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp_ {
    public static void main(String[] args) {
        //编写了爬虫 从百度页面跌倒如下文本
        String content="codasdiOSっジアSjだおい1231231";
        //提取传统的所有英文单词
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
