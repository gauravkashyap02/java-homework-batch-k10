class Student{
String name;

    Student(String s){
        name = s;
    }
    
    void display(){
        System.out.println("Name:  "+name);
    }

}

class Marksheet extends Student{
int marks1;
int marks2;
int marks3;

    Marksheet(String s, int m1, int m2 , int m3){
        super(s);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }   

    @Override
    void display(){
        int total = marks1 + marks2 +marks3;
        System.out.println("Name: "+name);
        System.out.println("total marks is: "+total);
    }
}

class Main{

    public static void main(String[] args){
        Marksheet mt = new Marksheet("gaurav",90,98,87);

        mt.display();
}
}