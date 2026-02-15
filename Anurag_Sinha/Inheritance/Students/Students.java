package Inheritance.Students;

import java.util.*;

class Students{
    String name;
    Students(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name=sc.nextLine();

    }
    void display(){
        System.out.println("Student Name:"+name);

    }
}

class MarkSheet extends Students{
    void display(){
        super.display();
        System.out.println("Total Marks: 270");
    }
}

class Main{
    public static void main(String[] args){
        MarkSheet m = new MarkSheet();
        m.display();
    }
}