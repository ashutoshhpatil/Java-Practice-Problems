package Inheritance.HybridInheritance;

class ProductionHouse{
    String phName = "YashRaj Films";
    String ownerName = "Ashutosh Patil";

    void dispProduction(){
        System.out.println("Production House: "+phName);
        System.out.println("Owner Name: "+ownerName);
    }
}

class Movie extends ProductionHouse{
    String movieTitle;
    int releaseYear;
    int budget;
    String genre;


    void dispMovie(){
        super.dispProduction();
        System.out.println("Movie Name: "+movieTitle);
        System.out.println("Genre: "+genre);
        System.out.println("Release Year: "+releaseYear);
        System.out.println("Budget: "+budget);
    }
}

class ActionMovie extends Movie{
    int stuntBudget = 25000;
    int noOfExplosion = 55;

    void dispAction(){
        movieTitle = "Jung";
        releaseYear = 1999;
        budget = 55000+stuntBudget;
        genre="Action";

        super.dispMovie();
        System.out.println("Stunt Budget: "+stuntBudget);
        System.out.println("Total Budget: "+budget);
        System.out.println("No Of Explosions: "+noOfExplosion);
    }
}

class ComedyMovie extends Movie{
    int comedianCount = 5;
    int comedyScenes = 55;

    void dispComedy(){
        movieTitle = "Hum Saath Saath Hain";
        releaseYear = 2001;
        budget = 255000;
        genre = "Comedy";

        super.dispMovie();
        System.out.println("Comedian COunt: "+comedianCount);
        System.out.println("Comeddy Scences: "+comedyScenes);
        System.out.println("Total Budget: "+budget);
    }

}

public class MovieProduction {
    public static void main(String[] args) {
        ActionMovie aa= new ActionMovie();
        aa.dispAction();

        System.out.println("=============================");

        ComedyMovie cc= new ComedyMovie();
        cc.dispComedy();

    }
}
