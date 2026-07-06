package Inheritance.Assignment1.SingleLevelInheritance;

class Gamer{
    String name;
    int gamerId;
    String Country;
    String favGame;
}

class EsportsPlayer extends Gamer{
    String teamName;
    int tournamentsPlayed;
    int tournamentsWon;
    int prizeMoney;

    void calPrizeMoney(){
        if(tournamentsWon>= 45){
        prizeMoney = tournamentsWon * 1000;
    }else {
            prizeMoney = tournamentsWon * 800;
        }
    }

    void dispDetails(){
        System.out.println("Name: "+name);
        System.out.println("Gamer ID: "+gamerId);
        System.out.println("Country: "+Country);
        System.out.println("Favourite Game: "+favGame);
        System.out.println("Team Name: "+teamName);
        System.out.println("Tournaments Played: "+tournamentsPlayed);
        System.out.println("Tournaments Won: "+tournamentsWon);
        System.out.println("Prize Money: "+prizeMoney);
    }
}

public class GamerEsports {
    public static void main(String[] args) {
        EsportsPlayer esp = new EsportsPlayer();
        esp.name = "Ahuja";
        esp.gamerId = 4594;
        esp.Country = "India";
        esp.favGame = "Kabbadi";
        esp.teamName = "U Mumba";

        esp.tournamentsPlayed = 54;
        esp.tournamentsWon = 47;
        esp.calPrizeMoney();
        esp.dispDetails();
    }
}
