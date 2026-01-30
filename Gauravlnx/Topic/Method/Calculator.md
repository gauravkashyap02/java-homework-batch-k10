package Method;

public class Calculator {

    int add(int a , int b){
        int c = a + b;
        return c;
    }

    int sub(int a , int b){
        int c = a - b;
        return c;
    }

    int multi(int a , int b){
        int c = a * b;
        return c;
    }

    int div(int a , int b){
        int c = a / b;
        if(a == 0 || b == 0){
            System.out.println("error");
        }
        return c;
    }


    public static void main(String[] args){

        Calculator calc = new Calculator();

        int result = calc.div(12,2);
        System.out.println("Sum is: " +result);

    }
}
