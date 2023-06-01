package before255;

public class VarParameterExercise{
	public static void main (String[]args) {
		HspMethod2 hm=new HspMethod2();
	System.out.println(	hm.showScore("milan",90.1,80.0));
	}
}
class HspMethod2{
	public	 String showScore(String name,double ...scores) {
		double totalScore =0;
		for(int i =0;i<scores.length;i++) {
			totalScore+=scores[i];
		}
		return name +"有"+scores.length+"总成绩分为="+totalScore;
	}
}