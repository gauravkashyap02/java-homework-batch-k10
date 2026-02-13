package Inheritance;

class Employee {
    String name="Anurag";
    void displayInfo(){
        System.out.println("Name: "+name);
    }
}
class Manager extends Employee{
    String department="HR";
    void displayInfo(){
        super.displayInfo();
        System.out.println("Department: "+department);
    }

    public static void main(String[] args){
        Manager m=new Manager();
        m.displayInfo();
    }
}