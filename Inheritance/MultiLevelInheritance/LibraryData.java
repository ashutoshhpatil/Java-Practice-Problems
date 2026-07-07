package Inheritance.Assignment1.MultilevelInheritance;

import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String libraryName;
    String location;

    void getDetails(){
        System.out.println("Enter Library Name:");
        libraryName = sc.nextLine();
        System.out.println("Enter Location: ");
        location = sc.next();
    }

    void dispDetails(){
        System.out.println("Library Name: "+libraryName);
        System.out.println("Location: "+location);
    }
}

class Books extends Library{
    int bookID;
    String bookTitle;
    String issueDate;
    String returnDate;
    int noOfDays;

    void getDetailsBook(){
        super.getDetails();
        System.out.println("Enter Book ID:");
        bookID = sc.nextInt();
        System.out.println("Book Title: ");
        bookTitle = sc.next();
        System.out.println("Issue Date: ");
        issueDate = sc.next();
        System.out.println("Returning Date: ");
        returnDate =sc.next();
        System.out.println("No of Days ");
        noOfDays = sc.nextInt();
    }
}

class IssuedBook extends Books{
    int lateDays = 2;
    int fine ;
    int fineAmount= 25;

    void calcFine(){
        fine = lateDays*fineAmount;
    }

    void dispDetailsIBook(){
        super.dispDetails();
        System.out.println("Book ID: "+bookID);
        System.out.println("book Title: "+bookTitle);
        System.out.println("Issue Date: "+issueDate);
        System.out.println( "Returning Date: "+returnDate);
        System.out.println("Allowed Days: "+noOfDays);
        System.out.println("Late Days: "+lateDays);
        System.out.println("Fine Amount:(Pay Immediately) "+fine);
    }
}

public class LibraryData {
    public static void main(String[] args) {
        IssuedBook ib = new IssuedBook();
        ib.getDetailsBook();
        ib.calcFine();
        ib.dispDetailsIBook();

    }
}
