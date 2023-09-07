public class Hw258{
	public static void main (String[]args) {
		Music music=new Music("啦啦啦",300);
		music.play();
		System.out.println(music.getInfo());
	}
}
class  Music{
	String name;
		int times;
		public Music (String name,int times) {
			this.name=name;
			this.times=times;
	}
	public void play() {
		System.out.println("音乐"+name+"正在播放时长"+times+"秒");
	}
	public String getInfo() {
		return "音乐"+name+"正在播放"+times+"秒";
	}
}