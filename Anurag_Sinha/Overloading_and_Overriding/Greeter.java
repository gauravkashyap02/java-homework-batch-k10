package Overloading_and_Overriding;

import java.util.*;

class Greeter {
    void greet(){
        System.out.println("Hello!");
    }

    void greet(String name){
        System.out.println("Hello, "+name+"!");
    }

    void greet(String name,String time){
        System.out.println("Good "+time+", "+name);
    }

    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);

        Greeter greeter=new Greeter();

        System.out.println("Enter your Name: ");
        String name=input.nextLine();

        System.out.println("Enter Parts of the Day Like [Morning, Afternoon, Evening, Night]: ");
        String time=input.nextLine();

        if(time.equals("Morning")||time.equals("Afternoon")||time.equals("Evening")||time.equals("Night")){
            greeter.greet();
            greeter.greet(name);
            greeter.greet(name,time);
        }
        else{
            System.out.println("Please Enter the Valid Parts of the Day Like [Morning, Afternoon, Evening, Night].");
        }

    }
}
