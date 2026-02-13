package Inheritance;

class Parent {
    Parent(){
        System.out.println("Parent Constructor Called.");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor Called.");
    }
    public static void main(String[] args){
        Child c= new Child();
    }
}
