class Animal{

    void makeSound(){
        System.out.println("Animal sound..");
    }
    public static void main(String[] args){
        Dog dg = new Dog();
        
        dg.makeSound();
        
        
    }
}

class Dog extends Animal{

void makeSound(){
System.out.println("Dog bark..");

}

}
