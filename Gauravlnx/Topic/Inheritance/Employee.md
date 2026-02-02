package Inheritance;

public class Employee {

    String name;

    void displayInfo(){
        System.out.println("Name is: "+name);
    }

}

class Manager extends Employee{
String department;

    Manager(String n , String d){
        name = n;
        department = d;
    }

    @Override
    void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Department is: "+department);
    }

    public static void main (String[] args){
        Manager manager = new Manager("Gaurav kumar","Development");

        manager.displayInfo();
    }
}