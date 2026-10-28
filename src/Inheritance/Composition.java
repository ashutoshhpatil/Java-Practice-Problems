// Advanced way of Inheritance = Composition "HAS-A" Relationship

package Inheritance;

class Engine{
    void start(){
        System.out.println("Engine is roaring to Life");
    }
}

class MyCar{
    Engine engine = new Engine();
    void startCar(){
        engine.start();
        System.out.println("This is Car's Engine");
    }
}

class MyBike{
    Engine engine = new Engine();
    void startBike(){
        engine.start();
        System.out.println("This is Bike's Engine");
    }
}

public class Composition {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.startCar();

        System.out.println("==========================");

        MyBike myBike = new MyBike();
        myBike.startBike();
    }
}
