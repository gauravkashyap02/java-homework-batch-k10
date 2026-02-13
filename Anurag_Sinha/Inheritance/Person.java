package Inheritance;

class Person {
    void ShowDetails(){

        System.out.println("Person Details.");
    }
}
class Student extends Person {
    void ShowDetails() {
        System.out.println("Student Details.");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.ShowDetails();
    }
}