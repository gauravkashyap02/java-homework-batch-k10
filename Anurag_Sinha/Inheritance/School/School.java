package Inheritance.School;

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
}

class Main{
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.showTeacherDetails();

    }
}