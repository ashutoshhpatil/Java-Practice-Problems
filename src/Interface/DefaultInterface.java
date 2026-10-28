package Interface;

interface SmartBulb{
    void switchON();

    void switchOff();

    default void showBrand(){
        dispBulb();
        System.out.println("Phillips Electric Bulb");
    }

    // We can create Private methods in Interface after Java 9
    private void dispBulb(){
        System.out.println("Private Method of Interface");
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
        SmartBulb.super.showBrand();

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
