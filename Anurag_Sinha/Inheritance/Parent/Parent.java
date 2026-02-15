package Inheritance.Parent;

class Parent {
    Parent(){

        System.out.println("Parent Constructor Called.");
    }
}
class Child extends Parent{
    Child(){

        System.out.println("Child Constructor Called.");
    }
}

class Main{
    public static void main(String[] args){

        Child c= new Child();
    }
}