package Overloading;

public class Shape {
void draw(){
System.out.println("Drawing Shape");
}
}

class Circle extends Shape{
void draw(){
System.out.println("Drawing Circle");
}
void draw(int radius){
System.out.println("Drawing Circle of radius: "+radius);
}
}
class Rectangle extends Shape{
void draw(){
System.out.println("Drawing Rectangle");
}
}

class Main3{
public static void main(String[] args){
Shape s = new Shape();
Circle c = new Circle();
Rectangle r = new Rectangle();

        s.draw();
        c.draw();
        c.draw(5);
        r.draw();
    }
}