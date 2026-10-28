package ClassandObjects;

public class LibraryManagementSystem {

    String bookTitle;
    String authorName;
    int totalCopies;
    int issuedCopies;
    int availableCopies;

    void addBooks(int copies){
        totalCopies += copies;
        availableCopies = totalCopies;
    }

    void issueBook(int copies){
        if(copies>availableCopies){
            System.out.println("Cannot issue books more than the available ones");
        }else{
             issuedCopies += copies;

            availableCopies = totalCopies - issuedCopies;
            System.out.println(copies + " books issued successfully");
        }
    }

    void returnBook(int copies){
        if(copies>issuedCopies){
            System.out.println("Cannot return more books than issued");
        }else{
            issuedCopies -=copies;
            availableCopies = totalCopies-issuedCopies;
            System.out.println(copies+ " Book Returned Succesfully");
        }
    }

    void displayLibraryStatus(){
        System.out.println("Total Copies: "+totalCopies);
        System.out.println("Issued Copies: "+issuedCopies);
        System.out.println("Available Copies: " +availableCopies);
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.bookTitle = "Kadambari";
        lms.authorName = "Shivaji Kadam";
        lms.addBooks(10);
        lms.issueBook(5);
        lms.returnBook(1);
        lms.displayLibraryStatus();

    }

}
