package Inheritance;

class College {
    String collegename="T.Institute";
}
class Admission extends College{
    String studentname="Anurag Sinha";
    String course="B.Tech";
    void displayInfo(){
        System.out.println("College Name : "+collegename);
        System.out.println("Student Name : "+studentname);
        System.out.println("Course : "+course);
    }
    public static void main(String[] args){
        Admission a=new Admission();
        a.displayInfo();
    }
}