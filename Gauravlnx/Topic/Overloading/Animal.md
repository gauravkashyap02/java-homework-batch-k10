package Overloading;

class Animal {

    void makeSound(){
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
void makeSound(){
System.out.println("Dog barks");
}
}
class Cat extends Animal{
void makeSound(){
System.out.println("Cat meows");
}
}
class Main{
public static void main(String[] args){
Animal a1 = new Animal();
Animal a2 = new Dog();
Animal a3 = new Cat();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

    }
}

