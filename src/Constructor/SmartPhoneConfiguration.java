package Constructor;

class SmartPhone{
    String brand;
    String model;
    int storage;
    boolean has5G;

    SmartPhone(){
        this("Samsung","Galaxy A15",128,false);
    }

    SmartPhone(String brand){
        this(brand,"Galaxy A15",128,false);
    }
    SmartPhone(String brand,String model){
        this(brand,model,128,true);
    }

    SmartPhone(String brand,String model,int storage,boolean has5G){
        this.brand=brand;
        this.model=model;
        this.storage=storage;
        this.has5G=has5G;

        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Storage: "+storage);
        System.out.println("Has 5G: "+has5G);
    }
}

public class SmartPhoneConfiguration {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        SmartPhone s2 = new SmartPhone("Oppo");
        SmartPhone s3 = new SmartPhone("Oppo","A51 5G");

    }
}
