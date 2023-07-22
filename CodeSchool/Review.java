package CodeSchool;
import java.util.Arrays;
public class Review {
    public static void main(String[] args) {

        double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}} ;


        System.out.println(Arrays.deepToString(scores));

        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;

        System.out.println(Arrays.deepToString(scores));

        double[][] newScores = new double[4][2];


        for(int i = 0; i < newScores.length; i++){
            for(int j = 0; j < newScores[i].length; j++){
                newScores[i][j] = scores[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newScores));

        for(int i = 0; i < newScores.length; i++){
            for(int j = 0; j < newScores[i].length; j++){
                if(newScores[i][j]<90){
                    newScores[i][j]+=2;
                }
            }
        }

        System.out.println(Arrays.deepToString(newScores));
    }
}