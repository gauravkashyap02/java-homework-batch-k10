package Inheritance;

import java.util.*;

class Shapes {
    void perimeter(){
        System.out.println("Calculating perimeter...");
    }
}
class Square extends Shapes{
    double side;
    void input(){
        System.out.println("Enter the one side of the Square: ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextDouble();
    }
    void perimeter(){
        super.perimeter();
        System.out.println("Perimeter of Square: "+(4*side));

    }
    public static void main(){
        Square s=new Square();
        s.input();
        s.perimeter();
    }
}
