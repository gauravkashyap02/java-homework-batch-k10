package OverloadingOverriding;

public class Calculator {
int add(int a , int b){
return a + b;
}
int add(int a , int b ,int c){
return a + b + c;
}

    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println("Sum of a and b is "+c.add(12 ,23));
        System.out.println("Sum of a and b and c is" + c.add(12,3,4));

    }
}
