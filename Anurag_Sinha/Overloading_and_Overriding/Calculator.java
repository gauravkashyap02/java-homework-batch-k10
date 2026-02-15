package Overloading_and_Overriding;

import java.util.*;

class Calculator {
    void add(int a,int b){
        System.out.println("Sum of "+a+" and "+b+" Is: "+(a+b));
    }

    void add(int a,int b,int c){
        System.out.println("#---------------------------------------------#");
        System.out.println("Sum of "+a+" , "+b+" and "+c+" Is: "+(a+b+c));
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);

        Calculator cal=new Calculator();

        System.out.println("Enter the first number: ");
        int a=sc.nextInt();

        System.out.println("Enter the second number: ");
        int b=sc.nextInt();

        System.out.println("Enter the third number: ");
        int c=sc.nextInt();

        cal.add(a,b);
        cal.add(a,b,c);
    }
}
