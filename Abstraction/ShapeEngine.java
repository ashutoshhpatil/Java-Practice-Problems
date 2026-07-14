package Abstraction;

abstract  class Shape{
    float rad;
    float pi = 3.14f;
    String shapeName;
    int l = 20;
    int b=  25;
    int side = 25;

    abstract String getShapeName();
    abstract double calcArea();
    abstract double calcPerimeter();

    void dispShape(){
        System.out.println("Shape Name: "+getShapeName());
        System.out.println("Area: "+calcArea());
        System.out.println("Perimeter: "+calcPerimeter());
    }
}

class Circle extends Shape{

    @Override
    String getShapeName() {
        return "Circle";
    }

    @Override
    double calcArea() {
        return pi * rad*rad;
    }

    double calcPerimeter(){
        return 2*pi*rad;
    }
}

class Rectangle extends Shape{

    @Override
    String getShapeName() {
        return "Rectangle";
    }

    @Override
    double calcArea() {
        return l*b;
    }

    double calcPerimeter(){
        return 2*(l+b);
    }
}

class Square extends Shape{


    @Override
    String getShapeName() {
        return "Square";
    }

    @Override
    double calcArea() {
        return side*side;
    }

    @Override
    double calcPerimeter() {
        return 4*side;
    }

}
public class ShapeEngine {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        obj1.dispShape();
        System.out.println("-------------------------");
        Shape obj2 = new Rectangle();
        obj2.dispShape();
        System.out.println("-------------------------");
        Shape obj3 = new Square();
        obj3.dispShape();
    }
}
