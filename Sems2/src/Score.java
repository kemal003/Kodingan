//package Barcelona;
import java.util.*;
public class Score {
    static public String homeClub = "Barcelona";
    private int scoreHome;
    private String awayClub;
    private int scoreAway;
    static public int kondisiSeri=0;
    static public int kondisiMenang=0;
    static public int kondisiKalah=0;
    
    //Constructor
    public Score(int scoreHome, String awayClub, int scoreAway) {
        this.scoreHome = scoreHome;
        this.awayClub = awayClub;
        this.scoreAway = scoreAway;
    }

    //Methods
    public int getScoreHome() {return scoreHome;}
    public String getAwayClub() {return awayClub;}
    public int getScoreAway() {return scoreAway;}
}

class MainBarca{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Score score[] = new Score[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Match " + (i+1));
            int scoreHome = inp.nextInt();
            inp.nextLine();
            String awayClub = inp.nextLine();
            int scoreAway = inp.nextInt();
            score[i]= new Score(scoreHome, awayClub, scoreAway);
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Home : %s, score -> %d\n", Score.homeClub, score[i].getScoreHome());
            System.out.printf("Away : %s, score -> %d\n\n", score[i].getAwayClub(), score[i].getScoreAway());
            if (score[i].getScoreAway()==score[i].getScoreHome()) Score.kondisiSeri++;
            else if (score[i].getScoreAway()>score[i].getScoreHome()) Score.kondisiKalah++;
            else if (score[i].getScoreAway()<score[i].getScoreHome()) Score.kondisiMenang++;
        }
        
        System.out.println("Jumlah menang kandang : " + Score.kondisiMenang);
        System.out.println("Jumlah kalah kandang : " + Score.kondisiKalah);
        System.out.println("Jumlah seri kandang : " + Score.kondisiSeri);
    }
}