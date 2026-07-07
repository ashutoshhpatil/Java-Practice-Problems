package Inheritance.HierarchicalInheritance;

class StreamingPlatform{
    String platformName = "Netflix";
    String subscriptionType = "Yearly";

    void dispStreamingPlatform() {
        System.out.println("Platform name: " + platformName);
        System.out.println("Subscription: " + subscriptionType);
    }
}

class Movie extends StreamingPlatform{
    String movieName = "Oppenheimer";
    int duration = 180;
    float rating = 4.5f;

    void dispMovie(){
        super.dispStreamingPlatform();
        System.out.println("Movie Name: "+movieName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Movie Rating: " + rating + "/5");
    }
}

class WebSeries extends StreamingPlatform{
    String seriesName = "Panchayat";
    int seasons = 5;
    int episodes = 8;

    void dispWeb(){
        super.dispStreamingPlatform();
        System.out.println("Series Name: "+seriesName);
        System.out.println("Seasons: "+seasons);
        System.out.println("Episodes Per Season: "+episodes);
    }
}
public class MovieData {
    public static void main(String[] args) {
        Movie movie =new Movie();
        movie.dispMovie();
        System.out.println();
        WebSeries webSeries = new WebSeries();
        webSeries.dispWeb();

    }
}
