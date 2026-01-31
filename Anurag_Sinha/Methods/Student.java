import java.util.*;

class Student {


    String name;
    int roll_no;
    double marks;

    void set_detail(String name,int roll_no,double marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    void display_info(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll_no);
        System.out.println("Marks: "+marks);
    }
    boolean hasPassed(){
        return marks>=40;
    }

    static void main(){
        Student student=new Student();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll_no=sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks=sc.nextDouble();

        student.set_detail(name,roll_no,marks);

        student.display_info();

        if(student.hasPassed()){
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed!");
        }
    }
}
