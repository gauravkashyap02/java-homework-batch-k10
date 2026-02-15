package Overloading_and_Overriding;

import java.util.*;

class AreaCalculator {
    double area(int radius){

        return Math.PI*radius*radius;
    }

    int area(int length,int breadth){
        return length*breadth;
    }

    double area(double base,double height){
        return 0.5*base*height;
    }

    public static void main(String[] args){
        AreaCalculator ac = new AreaCalculator();

        Scanner input=new Scanner(System.in);

        System.out.println("1. Area of Circle.");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("Choice Any One and Enter its no.[1,2,3]:");
        int choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the radius of Circle: ");
                int radius=input.nextInt();
                System.out.println("Area of Circle: "+ac.area(radius));
            break;

            case 2:
                System.out.println("Enter the Length of Rectangle: ");
                int length=input.nextInt();

                System.out.println("Enter the breadth of Rectangle: ");
                int breadth=input.nextInt();

                System.out.println("Area of Rectangle: "+ac.area(length,breadth));
            break;

            case 3:
                System.out.println("Enter the base of Triangle: ");
                double base=input.nextDouble();

                System.out.println("Enter the height of Triangle: ");
                double height=input.nextDouble();

                System.out.println("Area of Triangle: "+ac.area(base,height));
            break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
