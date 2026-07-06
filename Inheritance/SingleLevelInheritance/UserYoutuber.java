package Inheritance.Assignment1;

import java.util.Scanner;

class User{
    Scanner sc = new Scanner(System.in);
    String userName;
    String email;
    String country;

    void getDetails(){
        System.out.println("Enter Username");
        userName=sc.next();
        System.out.println("Enter Email");
        email=sc.next();
        System.out.println("Enter Country");
        country=sc.next();
    }
}

class YouTuber extends User{
    int totalVideos;
    int totalSubscribers;
    int totalEarnings;
    int totalViews;

    void calcIncome(){
        totalEarnings = 80*totalViews;
    }

    void getDetailsYT(){
        System.out.println("Enter No of Videos:");
        totalVideos = sc.nextInt();
        System.out.println("Total Subscribers: ");
        totalSubscribers = sc.nextInt();
        System.out.println("Total Views: ");
        totalViews = sc.nextInt();
    }
    void dispDetails(){
        System.out.println("Name "+userName);
        System.out.println("Email Id "+email);
        System.out.println("Country "+country);
        System.out.println("Total Subscribers: "+totalSubscribers);
        System.out.println("Total Videos "+totalVideos);
        System.out.println("Total Views "+totalViews);
        System.out.println("Total Earnings "+totalEarnings);
    }
}
public class UserYoutuber {
    public static void main(String[] args) {
        YouTuber yt =new YouTuber();
        yt.getDetails();
        yt.getDetailsYT();
        yt.calcIncome();
        yt.dispDetails();
    }



}
