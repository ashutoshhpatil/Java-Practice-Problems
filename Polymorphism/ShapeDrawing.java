package Polymorphism.Overriding;

class Shape{
    String shapeName;

    void draw(){
        System.out.println("Drawing Shape");
        System.out.println("Shape Name: "+shapeName);
    }
}

class Circle extends Shape{
    int rad = 7;

    @Override
    void draw() {
        shapeName  = "Circle";
        super.draw();
        System.out.println("Radius: "+rad);
    }
}

class Rectangle extends Shape{
    int length = 10;
    int breadth = 20;

    @Override
    void draw() {
        shapeName  = "Rectangle";
        super.draw();
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}


class Square extends Shape{
    int side = 50;

    @Override
    void draw() {
        shapeName  = "Square";
        super.draw();
        System.out.println("Side: "+side);
    }
}

class Triangle extends Shape{
    int base = 5;
    int height = 20;

    @Override
    void draw() {
        shapeName  = "Triangle";
        super.draw();
        System.out.println("Base: "+base);
        System.out.println("Height: "+height);
    }
}

class Pentagon extends Shape{
    int noOfSides = 5;

    @Override
    void draw() {
        shapeName  = "Pentagon";
        super.draw();
        System.out.println("No of Sides: "+noOfSides);
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Shape []shapes = {
                new Circle(),
                new Square(),
                new Rectangle(),
                new Triangle(),
                new Pentagon()
        };

        for(Shape s: shapes){
            s.draw();
            System.out.println("-----------------");
        }
    }
}
