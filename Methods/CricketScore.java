package Methods.Assignment1;

public class CricketScore {
    String playerName;
    String teamName;
    int runsScored;
    int ballsFaced;
    double strikeRate;

    void setPlayerDetails(String playerName, String teamName){
        this.playerName = playerName;
        this.teamName=teamName;
        System.out.println("Player Name: "+playerName);
        System.out.println("Team Name: "+teamName);
    }

    int getRunsScored(){
        runsScored = 95;
        return runsScored;
    }

    double calcStrikeRate( int ballsFaced){
        this.ballsFaced=ballsFaced;

        strikeRate = (double) (runsScored*100)/ballsFaced;
        return strikeRate;
    }

    void dispDetails(){
        System.out.println("Runs Scored: "+runsScored);
        System.out.println("Balls Faced: "+ballsFaced);
    }

    public static void main(String[] args) {
        CricketScore cricketScore =new CricketScore();
        cricketScore.setPlayerDetails("Rohit","India");
        cricketScore.getRunsScored();
        cricketScore.calcStrikeRate(40);
        cricketScore.dispDetails();
        System.out.println("Strike Rate: "+cricketScore.strikeRate);
    }
}
