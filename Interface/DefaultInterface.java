package Interface;

interface SmartBulb{
    void switchON();

    void switchOff();

    default void showBrand(){
        System.out.println("Phillips Electric Bulb");
    }
}

class LEDBulb implements SmartBulb{
    String bulbStatus;
    public void switchON(){
        bulbStatus = "ON";
    }

    public void switchOff(){
        bulbStatus = "OFF";
    }

    @Override
    public void showBrand() {
        System.out.println("Bajaj Electric Bulb");
        System.out.println("Status: "+bulbStatus);
    }
}

public class DefaultInterface {
    public static void main(String[] args) {
        SmartBulb obj = new LEDBulb();
        obj.switchOff();
        obj.showBrand();


    }
}
