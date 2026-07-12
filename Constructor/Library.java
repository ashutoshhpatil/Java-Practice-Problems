package Constructor;

public class Library {
    String title;
    String author;
    int price;

    Library(){
        System.out.println("Default Constructor Called");
    }

    Library(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("Parameterized Constructor Called");
    }

    void dispBookInfo(){
        System.out.println("Book Name: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Book Price: "+price);
    }
}

class Main{
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.dispBookInfo();
        Library l2 = new Library("Java A Novel","Ashutosh Patil",650);
        l2.dispBookInfo();
    }
}
