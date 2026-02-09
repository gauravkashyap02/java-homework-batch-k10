package Constructor;
import java.util.*;
class Rectangle {
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void checkSameArea(Rectangle r1,Rectangle r2){
        double area1=r1.length*r1.breadth;
        double area2=r2.length*r2.breadth;
        if(area1==area2){
            System.out.println("Rectangles are Same");
        }
        else{
            System.out.println("Rectangles are not Same");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the First Rectangle: ");
        double length=sc.nextDouble();

        System.out.println("Enter the breadth of the First Rectangle: ");
        double breadth=sc.nextDouble();
        Rectangle r1=new Rectangle(length,breadth);


        System.out.println("Enter the length of the Second Rectangle: ");
        double length2=sc.nextDouble();

        System.out.println("Enter the Breadth of the Second Rectangle: ");
        double breadth2=sc.nextDouble();

        Rectangle r2=new Rectangle(length2,breadth2);

        r1.checkSameArea(r2,r1);
    }
}
