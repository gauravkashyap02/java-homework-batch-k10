package Constructor;

import java.util.Scanner;
public class Triangle {

    int length;
    int breadth;

    Triangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    void compareArea(Triangle t){

        int area1 = length * breadth;
        int area2 = t.length*t.breadth;

        if (area1 == area2){
            System.out.println("Both area is same:");
        }else{
            System.out.println("Both are not same:");
        }

    }

    public static void main(String[] args){
        Triangle ss = new Triangle(43,53);
        Triangle ss2 = new Triangle(45, 34);

        ss.compareArea(ss2);
    }
}
