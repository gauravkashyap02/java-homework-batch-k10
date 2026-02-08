package Inheritance;

class College {
String collegeName;
}

class Admission extends College{
String studentName;
String course;

    void display(){
        System.out.println("College: "+collegeName);
        System.out.println("Student: "+studentName);
        System.out.println("Course: "+course);
    }
}

class Main5{
public static void main(String[] args){
Admission a = new Admission();
a.collegeName = "Techno Institute";
a.studentName = "Gaurav";
a.course = "B.Tech";

        a.display();
    }
}