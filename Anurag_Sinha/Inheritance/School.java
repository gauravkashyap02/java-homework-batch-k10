package Inheritance;

class School {
    String SchoolName="S.G.D";
    void showSchool(){
        System.out.println("School Name:" +SchoolName);
    }
}
class Teacher extends School{
    String TeacherName="Mr.Sharma";
    void showTeacherDetails(){
        showSchool();
        System.out.println("Teacher Name:" +TeacherName);
    }
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.showTeacherDetails();

    }
}