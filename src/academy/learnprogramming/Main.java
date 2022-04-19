package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    int newScore=    calucateScore("Sadid",500);
        System.out.println("New score is "+newScore);
        calucateScore(75);
        calucateScore();
    }
    public static int calucateScore(String playerName, int score){
        System.out.println("player "+playerName+" scored "+score + " points");
        return score*1000;
    }
    public static int calucateScore( int score){
        System.out.println("Unnamed player"+ " scored "+score + " points");
        return score*1000;
    }
    public static int calucateScore( ){
        System.out.println("No player name , no player score");
        return 0;
    }


}
