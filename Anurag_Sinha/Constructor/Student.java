package Constructor;
import java.util.*;

class Student {
    int id;
    String name;

    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    Student s=new Student();

    System.out.println("Enter The Student Id:");
    s.id=sc.nextInt();

    System.out.println("Enter Student Name: ");
    s.name=sc.next();

    StudentInfoPrinter sip=new StudentInfoPrinter();

    sip.StudentInfoPrinter(s);
    }
}
class StudentInfoPrinter{
    void StudentInfoPrinter(Student s){
        System.out.println("Student Id: "+s.id);
        System.out.println("Student Name: "+s.name);
    }
}
