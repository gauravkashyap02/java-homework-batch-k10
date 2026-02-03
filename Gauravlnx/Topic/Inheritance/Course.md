package Inheritance;

public class Course {
String courseName;

    void showCourse(){
        System.out.println("course name: "+courseName);
    }
}
class EnrolledStudent extends Course{
String studentName;
int rollNum;

     EnrolledStudent(String cn, String sn, int rn){
         courseName = cn;
         studentName = sn;
         rollNum = rn;
     }

     @Override
     void showCourse(){
         System.out.println("Course Name: "+courseName);
         System.out.println("student name: "+studentName);
         System.out.println("student roll num: "+rollNum);
     }
    public static void main(String[] args){
        EnrolledStudent es = new EnrolledStudent("B.tech","Gaurav kumar", 12);

        es.showCourse();
    }
}
