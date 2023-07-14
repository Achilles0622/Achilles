package java0609_;

public class EnumDetail {
    public static void main(String[] args) {
   Music.CLSSICMUSIC.playing();
    }
}
class AS{

}
//enum Season3 extends AS{
//
//}
interface IPlaying{
    public void playing();
}
enum Music implements IPlaying{
    CLSSICMUSIC;
 public void playing(){
     System.out.println("播放好听的");
 }
}