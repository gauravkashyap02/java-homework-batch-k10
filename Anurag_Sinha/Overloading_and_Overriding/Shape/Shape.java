package Overloading_and_Overriding.Shape;

import java.util.*;

class Shape {
    void draw(){
        System.out.println("Drawing Shape...");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void draw(int radius) {
        System.out.println("Drawing Circle of radius: " + radius);
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        Shape s=new Shape();
        Shape s1=new Circle();
        Circle c=new Circle();
        Shape s2=new Rectangle();

        System.out.println("Enter the Radius for Circle: ");
        int radius=input.nextInt();
        s.draw();

        s1.draw();
        c.draw(radius);

        s2.draw();

    }
}