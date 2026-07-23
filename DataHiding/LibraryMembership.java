package DataHiding;

class Library{
    private int memberID;
    private int finePending;
    private int booksIssued;

    Library(int id,int startingFine, int booksIssued){
        this.booksIssued = booksIssued;
        this.memberID =id;
        this.finePending =startingFine;
    }

    void issueBook(){
        if(booksIssued<3  ){
            System.out.println("Book Issued Successfully");
            booksIssued++;
        }else {
            System.out.println("Issue Limit Reached");
        }
    }

    void returnBook(int lateDays){
         
        if(booksIssued>=1){
            booksIssued--;
        }else {
            System.out.println("No Book to return");
        }

        if(lateDays>0){
            finePending += 10*lateDays;
        }
    }

    void payFine(double Amount){
        finePending = Math.abs(finePending-(int)Amount);
        System.out.println("Paid Fine: " + Amount);
        System.out.println("Remaining Fine: " + finePending);

    }

    void dispInfo(){
        System.out.println("Library ID: "+memberID);
        System.out.println("Books Issued: "+booksIssued);

    }
}

public class LibraryMembership {
    public static void main(String[] args) {
        Library obj = new Library(12,0,0);
        obj.issueBook();
        obj.issueBook();
        obj.issueBook();
        obj.issueBook();

        obj.returnBook(10);
        obj.payFine(60);
        obj.dispInfo();
    }
}
