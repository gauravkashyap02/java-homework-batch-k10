package Inheritance;

public class Food {
String foodName;

    void display(){
        System.out.println("Food: "+foodName);
    }
}

class Dessert extends Food{
String sweetnessLevel;

    void display(){
        System.out.println("Food: "+foodName);
        System.out.println("Sweetness Level: "+sweetnessLevel);
    }
}

class Main4{
public static void main(String[] args){
Dessert d = new Dessert();

        d.foodName = "Gulab Jamun";
        d.sweetnessLevel = "High";
        d.display();


    }
}