package Constructor;

class Farmer{
    Farmer(String name,String cropName){
        System.out.println("Two Parameters");
        System.out.println("Farmer Name: "+name);
        System.out.println("Crop Name: "+cropName);
    }

    Farmer(String name){
        System.out.println("One Parameter");
        System.out.println("Farmer Name: "+name);
    }

    Farmer(String name, String cropName, float income){
        System.out.println("Three Parameters");
        System.out.println("Farmer Name: "+name);
        System.out.println("Crop Name: "+cropName);
        System.out.println("Crop Income: "+income);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Farmer f1 = new Farmer("Kashinath ","Sugarcane");
        System.out.println("=============================================================");
        Farmer f2 = new Farmer("Dynoba");
        System.out.println("============================================================="); 
        Farmer f3 = new Farmer("Tukaram","Soyabean", 160560.5f);

    }
}
