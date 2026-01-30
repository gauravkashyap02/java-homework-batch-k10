package Method;

public class Student {

    String name;
    int rollNum;
    double marks;

    void setDetails(String n, int rn, double m){
        name = n;
        rollNum = rn;
        marks = m;
    }

    void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Roll num is " +rollNum);
        System.out.println("Marks is "+marks);
    }

    void hasPassed(){
        if(marks >= 90){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void main(String[] args){

        Student s = new Student();

        s.setDetails("Gaurav",14,99.9);
        s.displayInfo();
        s.hasPassed();



    }
}
