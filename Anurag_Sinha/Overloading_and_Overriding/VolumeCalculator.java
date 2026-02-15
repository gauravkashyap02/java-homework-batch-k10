package Overloading_and_Overriding;

import java.util.*;

class VolumeCalculator {
    void volume(int side){
        System.out.println("Cube Volume is: "+(side*side*side));
    }

    void volume(int length,int breadth,int height){
        System.out.println("Cuboid Volume is: "+(length*breadth*height));
    }

    void volume(double radius,double height){
        System.out.println("Cylinder Volume is: "+( Math.PI * radius * radius * height));
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        VolumeCalculator c=new VolumeCalculator();

        System.out.println("1.Volume of Cube.");
        System.out.println("2.Volume of Cuboid.");
        System.out.println("3.Volume of Cylinder.");
        System.out.println("Choice Any One and Enter that no.[1,2,3]:");
        int choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter One Side of Cube: ");
                int side=input.nextInt();
                c.volume(side);
            break;
            case 2:
                System.out.println("Enter Length of Cuboid: ");
                int length=input.nextInt();

                System.out.println("Enter Breadth of Cuboid: ");
                int breadth=input.nextInt();

                System.out.println("Enter Height of Cuboid: ");
                int height=input.nextInt();

                c.volume(length,breadth,height);
            break;
            case 3:
                System.out.println("Enter radius of Cylinder: ");
                double radius=input.nextDouble();

                System.out.println("Enter height of Cylinder: ");
                double height1=input.nextDouble();

                c.volume(radius,height1);
            break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}