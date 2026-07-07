//Single + Hierarchical

package Inheritance.HybridInheritance;

class YouTube{
    String subscriptionType;
    int earnings;
}

class Creator extends YouTube{
    String channelName;
    int subscribers;
    int views;

    void dispCreator(){
        channelName = "Mechanical Partner";
        subscribers = 90;
        views = 1200;

        earnings = views*15;

        System.out.println("Channel Name: "+channelName);
        System.out.println("Total Earnings: "+earnings);
    }
}

class GamingCreator extends Creator{
    int liveStreams;
    int donations;
    int SponserIncome;

    void dispGaming(){
        channelName = "Gaming Partner";
        subscribers = 900;
        views = 10000;

        earnings = views*13;

        System.out.println("Channel Name: "+channelName);
        System.out.println("Total Earnings: "+earnings);
    }
}

class Vlogger extends Creator{
    int videosUploaded;
    int brandDeals;
    int adRevenue;

    void dispVlogger(){
        channelName = "Daily Vlogs";
        subscribers = 9000;
        views = 100000;

        earnings = views*9;

        System.out.println("Channel Name: "+channelName);
        System.out.println("Total Earnings: "+earnings);
    }
}

public class YoutubeData {
    public static void main(String[] args) {
Vlogger obj = new Vlogger();
GamingCreator gg = new GamingCreator();
obj.dispVlogger();
        System.out.println("====================");
obj.dispCreator();
        System.out.println("====================");
gg.dispGaming();


    }
}
