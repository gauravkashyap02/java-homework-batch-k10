package Overloading_and_Overriding.Animal;

class Animal {
    void makeSound(){
        System.out.println("Animal Makes Sound");
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
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();

    }
}
