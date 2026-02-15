package Inheritance.Food;

class Food {
    String foodname="Gulab Jamun";
    void display(){
        System.out.println("Food: "+foodname);
    }
}
class Dessert extends Food{
    String sweetnesslevel="High";
    void display(){
        super.display();
        System.out.println("Sweetness Level: "+sweetnesslevel);
    }

}

class Main{
    public static void main(String[] args){
        Dessert d=new Dessert();
        d.display();
    }
}

