package Inheritance.Assignment1.MultilevelInheritance;

class Book{
    int bookID = 56478;
    String bookName = "Java: A Novel";
    String author = "Ashutosh";
}


class Novel extends Book{
    int noOfPages = 562;
    String genre = "Tech";

    void dispNovel(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Book ID: "+bookID);
        System.out.println("Author: "+author);
        System.out.println("How Many Pages: "+noOfPages);
        System.out.println("Genre: "+genre);
    }
}

class Ebook extends  Novel{
    int readingSpeed = 3;
    float readingTime =(float) readingSpeed/noOfPages;

    void dispDetails(){
        super.dispNovel();
        System.out.println("Reading Speed(Pages/Hour): "+readingSpeed);
        System.out.println("Reading Time: "+readingTime);
    }
}

public class BookData {
    public static void main(String[] args) {
        Ebook obj = new Ebook();
        obj.dispDetails();

    }
}
