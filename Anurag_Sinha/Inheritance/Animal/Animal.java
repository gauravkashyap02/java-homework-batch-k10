package Inheritance.Animal;

class Animal {
    void makeSound(){
        System.out.println("Making Sound");

    }
}
class Dog extends Animal{
    void makeSound(){

        System.out.println("Dog Barks!!");
    }
}

class Main{

    public static void main(String[] args) {
        Dog d = new Dog();

        d.makeSound();

    }
}