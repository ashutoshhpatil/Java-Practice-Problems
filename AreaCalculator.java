package Polymorphism.Overloading;

public class AreaCalculator {
    String shape;
     double actualArea;

    void area(double side){
        shape = "Square";
        actualArea = side*side;

        System.out.println("Shape: "+shape);
        System.out.println("Side: "+side);
        System.out.println("Area of: "+shape+ " is " +actualArea);
    }

    void area(double length, double breadth){
        actualArea =length*breadth;

        System.out.println("Shape: "+(shape = "Rectangle"));
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area of: "+shape+ " is " +actualArea);
    }

    void area(double radius , char Shape){

        shape = Character.toString(Shape);
        actualArea = 3.14* radius*radius;


        System.out.println("Shape: "+shape);
        System.out.println("Radius: "+radius);
        System.out.println("Area of: "+shape+ " is " +actualArea);
    }

    void area(int base , int height){
        shape ="Triangle";
        actualArea = 0.5*base*height;

        System.out.println("Shape: "+shape);
        System.out.println("Base: "+base);
        System.out.println("Height: "+height);
        System.out.println("Area of: "+shape+ " is " +actualArea);

    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(12.4);
        System.out.println("-------------------------");
        obj.area(10.5,20);
        System.out.println("-------------------------");
        obj.area(10,2);
        System.out.println("-------------------------");
        obj.area(20.5,'c');
    }
}
