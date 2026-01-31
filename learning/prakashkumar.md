class Animals {
void makeSound(){
System.out.println("Animals makes a sounds");
}

}

class Dog extends Animals {
void makeSound(){
System.out.println("Dog barks");
}

    public static void main (String[]args){
        Dog b = new Dog();
        b.makeSound();
    }
}
