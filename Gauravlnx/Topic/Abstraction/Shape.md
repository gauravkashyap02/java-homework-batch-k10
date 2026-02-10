package Abstraction;

abstract class Shape {
String name;

    Shape(String n){
        name = n;
    }

    abstract double area();

    @Override
    public String toString(){
        return "Shape: "+name+ ", Area: "+area();
    }
}

class Circle extends Shape{
double radius;

    Circle(double rad){
      super("Circle");
      radius = rad;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
double height;
double width;

    Rectangle(double h , double w){
        super("Rectangle");
        height = h;
        width = w;
    }

    @Override
    double area() {
        return height * width;
    }
}

class Main{
public static void main(String args[]) {
Shape c = new Circle(3);
Shape r = new Rectangle(4,5);

        System.out.println(c);
        System.out.println(r);
    }
}