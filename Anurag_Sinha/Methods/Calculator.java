import java.util.*;
class Calculator {
    void Add(double a,double b){
        System.out.println("The sum is "+(a+b));
    }

    void Subtract(double a,double b){
        System.out.println("The subtraction is "+(a-b));
    }

    void Multiply(double a,double b){
        System.out.println("The multiplication is "+(a*b));
    }

    void Divide(double a,double b){
        if(a==0||b==0){
            System.out.println("Error: Cannot divide by zero");
        }
        else{
            System.out.println("The divide is "+(a/b));
        }
    }

    static void main(){
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();

        char option;
        System.out.println("A.Add");
        System.out.println("B.Substract");
        System.out.println("C.Multiply");
        System.out.println("D.Divide");
        System.out.print("Enter your choice:");
        option=sc.next().charAt(0);

        double a;
        double b;
        switch(option){
            case 'A':
            case 'a':
                System.out.print("Enter First Number For Addition: ");
                a=sc.nextDouble();

                System.out.print("Enter Second Number For Addition: ");
                b=sc.nextDouble();

                calculator.Add(a,b);
            break;
            case'B':
            case'b':
                System.out.print("Enter First Number For Subtraction: ");
                    a=sc.nextDouble();

                System.out.print("Enter Second Number For Subtraction: ");
                    b=sc.nextDouble();

                calculator.Subtract(a,b);
            break;
            case'C':
            case'c':
                System.out.print("Enter First Number For Multiplication: ");
                a=sc.nextDouble();

                System.out.print("Enter Second Number For Multiplication: ");
                b=sc.nextDouble();

                calculator.Multiply(a,b);
            break;
            case'D':
            case'd':
                System.out.print("Enter First Number For Divide: ");
                a=sc.nextDouble();

                System.out.print("Enter Second Number For Divide: ");
                b=sc.nextDouble();

                calculator.Divide(a,b);
            break;
            default:
                System.out.println("Invalid option");




        }
    }
}
