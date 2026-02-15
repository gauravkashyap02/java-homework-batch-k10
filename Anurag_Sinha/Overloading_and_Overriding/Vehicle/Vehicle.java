package Overloading_and_Overriding.Vehicle;

class Vehicle {
    void displayInfo(){
        System.out.println( "Generic Vehicle");
    }
}
class Car extends Vehicle{
    void displayInfo(){
        System.out.println( "Car: 4 wheels");
    }
}
class Bike extends Vehicle{
    void displayInfo(){
        System.out.println("Bike: 2 wheels");
    }
}

class Main{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        Vehicle v2=new Car();
        Vehicle v3=new Bike();
        v.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
    }
}
