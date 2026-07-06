package Inheritance.Assignment1.MultilevelInheritance;

class Mobile{
    String company = "Samsung";
    String model = "S26 Ultra";

    void dispMobile(){
        System.out.println("Company: "+company);
        System.out.println("Model: "+model);
    }
}

class SmartPhone extends Mobile{
    int totalStorage = 256;
    int RAM = 8;

    boolean getSmartPhone() {
        if (totalStorage > 128 && RAM >= 8) {
            return true;
        } else {
             return false;
        }
    }

    void dispSmartPhone() {
        super.dispMobile();
        System.out.println("Total Storage: " + totalStorage);
        System.out.println("RAM: " + RAM);

    }
}

class AndroidPhone extends SmartPhone{
    int usedStorage = 196;
    int availableStorage = totalStorage -usedStorage;

    void dispAndroid(){
        super.dispSmartPhone();
        System.out.println("Used Storage: "+usedStorage);
        System.out.println("Available Storage: "+availableStorage);
        if(true){
            System.out.println("--->Can be used for Gaming");
        }else {
            System.out.println("--->Not for Gaming");
        }
    }
}


public class MobileData {
    public static void main(String[] args) {
        AndroidPhone ap = new AndroidPhone();
        ap.dispAndroid();
    }
}
