package Interface;

interface Printer{
    void printDoc();
    void scanDoc();
}

class HPPrinter implements Printer{
    public void printDoc(){
        System.out.println("Printing Document");
    }

    public  void scanDoc(){
        System.out.println("Scanning Document");
    }
}

public class BasicPrinter {
    public static void main(String[] args) {
        Printer obj= new HPPrinter();           // Parent's Reference ---> Child's Object
        obj.printDoc();
        obj.scanDoc();
    }
}
