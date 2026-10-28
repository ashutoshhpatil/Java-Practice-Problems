package ClassandObjects;

public class LibraryMember {

    String memeberName;
    int bookissued;
    int count =0;

    void issueBook(){

        if(bookissued>=5){
            System.out.println("Issue Limit Reached");
        }
        else {
            bookissued++;
        }
    }

    void returnBook(){
        if(bookissued <=0 ){
            System.out.println("No Books to return");
        }
        else{
             bookissued--;
        }
    }

    void displayStatus(){
        System.out.println("Member Name: " + memeberName);
        System.out.println("Books Issued: " + bookissued);
    }

    public static void main(String[] args) {
        LibraryMember lm = new LibraryMember();
        lm.memeberName = "Shakti";
        lm.bookissued = 1;

        lm.displayStatus();

        lm.issueBook();
        lm.issueBook();

        lm.returnBook();

    }
}
