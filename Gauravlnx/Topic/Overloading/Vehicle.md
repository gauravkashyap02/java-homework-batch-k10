package Overloading;

class Vehicle {

    void displayInfo(){
        System.out.println("Generic Vehicle");
    }

}
class Car extends Vehicle{
    void displayInfo(){
        System.out.println("Car: 4 Wheels");
    }
}
class Bike extends Vehicle{
    void displayInfo(){
        System.out.println("Bike: 2 Wheels");
    }
}

class Main2{
    public static void main(String args[]){
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();

        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
    }
}

