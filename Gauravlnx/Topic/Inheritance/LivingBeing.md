class LivingBeing{

    void breathe(){
        System.out.println("LivingBeing Can breadth");
    }

}

class Animal extends LivingBeing{
void eats(){
System.out.println("Animals can eat");
}

}

class Dog extends Animal{
void bark(){
System.out.println("Dog can bark");
}
}

class Main{
public static void main(String[] args){
Dog dog = new Dog();
dog.breathe();
dog.eats();
dog.bark();
}
}