package Overloading;

public class Greeter {

    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
        System.out.println("Hello "+name);
    }

    void greet(String tod , String name){
        System.out.println(tod+" "+name);
    }


    public static void main(String[] args){
        Greeter g = new Greeter();

        g.greet();
        g.greet("Diya");
        g.greet("Good Morning","Diya");
    }


}
