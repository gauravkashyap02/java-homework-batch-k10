package Inheritance.Course;

class Course {
    String CourseName="Inheritance";

    void showCourse(){
        System.out.println("Course Name:"+CourseName);
    }
}
class  EnrolledStudent extends Course{
    String StudentName="Anurag Sinha";
    int rollNumber=1;
    void showCourse(){
        super.showCourse();
        System.out.println("Student Name:"+StudentName);
        System.out.println("Roll Number:"+rollNumber);
    }
}

class Main{
    public static void main(String[] args){
        EnrolledStudent e=new EnrolledStudent();
        e.showCourse();
    }
}