package Inheritance.LivingBeing;

class LivingBeing {
    void breath(){

        System.out.println("Breathing...");
    }
}

class Animals extends LivingBeing{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dogs extends Animals {
    void bark(){

        System.out.println("Barking...");
    }
}

class Main{
    public static void main(){
        Dogs d=new Dogs();
        d.breath();
        d.eat();
        d.bark();
    }
}