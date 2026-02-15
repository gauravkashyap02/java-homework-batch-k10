package Inheritance.animals;

class animals {
    void eat(){

        System.out.println("Animal is eating");
    }

}
class Cat extends animals {
    void eat() {

        System.out.println("Cat is eating");
    }

    void sound() {

        System.out.println("Cat meows");
    }
}

class Main{
    public static void main() {
        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}