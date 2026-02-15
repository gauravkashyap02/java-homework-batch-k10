package Inheritance.Shape;

import java.util.*;

class Shape {

    void area() {
        System.out.println("Calculating area...");
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter The Length Of Rectangle:");
        this.length= sc.nextInt();

        System.out.println("Enter The Breadth Of Rectangle:");
        this.breadth=sc.nextInt();
    }

    void area(){
        int area=length*breadth;

        System.out.println("Area Of Rectangle: "+area);
    }
}

class Main{
    public static void main(){
        Shape s = new Rectangle();
        s.area();
    }
}
