package Overloading_and_Overriding;

import java.util.*;

class Student {
    void printdetail(String name,int age){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }

    void printdetail(String name,int age,String course){
        System.out.println("#---------------------------------#");
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Course: "+course);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();

        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();

        System.out.println("Enter Student Age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Course: ");
        String course=sc.nextLine();

        s.printdetail(name,age);
        s.printdetail(name,age,course);
    }
}
