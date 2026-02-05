package Overloading;
import java.awt.geom.Area;

public class AreaCalculator {

    double area(int radius){
        double a = Math.PI * radius * radius;
        return a;
    }

    int area(int length , int breadth){
        int a = length * breadth;
        return a;
    }

    double area(double base , double height){
        double a = 1/2 * base * height;
        return a;
    }

    public static void main(String[] args){
        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area of Circle: "+ac.area(5));
        System.out.println("Area of Rectangle: "+ac.area(10, 10));
        System.out.println("Area of Triangle: "+ac.area(3,9));
    }

}
