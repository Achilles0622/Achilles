package java0617_;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new news("coronacoronacoronacoronacorona"));
        arrayList.add(new news("1234566788990040044"));
        int size=arrayList.size();
        for (int i =size-1; i >=0 ; i--) {
            //System.out.println(arrayList.get(i)    );
            news news = (news) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));

        }
    }
    public static String processTitle(String title){
        if(title==null){
            return " ";
        }
        if(title.length()>15){
            return title.substring(0,15);
        }else {
            return title;
        }
    }


}
class news{
    private String title;
    private String  content;

    public news(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                '}';
    }
}
