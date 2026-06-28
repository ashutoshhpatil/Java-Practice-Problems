package ClassandObjects;

public class Book {

    String title = "Truths of Humanity";
    String author = "Harishchandra Pandey";


    int info(int price, int pages){

        System.out.println("Price : "+price);
        System.out.println("Pages of Book: " +pages);

        if(price>500){
            System.out.println("Expensive Book");
        }
return price;
    }

    public static void main(String[] args) {


        Book bb  = new Book();
        System.out.println("Title :" +bb.title);
        System.out.println("Author :" +bb.author);

        bb.info(1450,600);
    }
}
