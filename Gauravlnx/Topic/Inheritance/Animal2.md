class Animal{

    void eat(){
        System.out.println("Animal is eating");
    }

}

class Cat extends Animal{

    @Override
    void eat(){
        System.out.println("Cat is eating");
    }

    void sound(){
        System.out.println("Cat meows")
    }
}
class Main{
    
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}