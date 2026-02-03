package OverloadingOverriding;

public class Student {
String name;
int age;

    void printDetails(String n, int a){
        name = n;
        age = a;
        System.out.println("Name is: "+name+","+" Age is:  "+age);
    }

    String course;
    void printDetails(String n , int a , String c){
        name = n;
        age = a;
        course = c;
        System.out.println("Name is: "+name+","+" Age is: "+age+","+" Course is: "+course);
    }

    public static void main(String[] args){
        Student s = new Student();

        s.printDetails("Rahul kumar", 90);
        s.printDetails("Ananya sinha",22,"B.tech");
    }
}
