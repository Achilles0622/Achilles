package java0614_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args)throws ParseException {
        Date d1=new Date();
        System.out.println("当前日期是"+d1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format= sdf.format(d1);
        System.out.println("当前时期是"+format);
        String s="1996年01月01日 10:10:30 星期一";
        Date parse=sdf.parse(s);
        System.out.println("parse="+parse);
    }
}
