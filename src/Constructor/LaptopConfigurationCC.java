package Constructor;

class Laptop{
    String brand;
    String processor;
    int ram;
    boolean hasSSD;

    Laptop(){
        this("Dell","Intel I5",8,true);
    }

    Laptop(String brand){
        this(brand,"Intel I5",8,true);
    }

    Laptop(String brand,String processor){
        this(brand,processor,8,true);
    }

    Laptop(String brand,String processor,int ram){
        this(brand,processor,ram,true);
    }

    Laptop(String brand, String processor, int ram, boolean hasSSD){
        this.brand = brand;
        this.processor=processor;
        this.ram=ram;
        this.hasSSD=hasSSD;

        System.out.println("Brand: "+brand);
        System.out.println("Processor: "+processor);
        System.out.println("RAM: "+ram);
        System.out.println("Has SSD: "+hasSSD);
    }
}

public class LaptopConfigurationCC {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP");
        Laptop l3 = new Laptop("Lenovo", "AMD Ryzen 7");
        Laptop l4 = new Laptop("Asus", "Intel i7", 16);
        Laptop l5 = new Laptop("Apple", "M4", 24, true);
    }
}
