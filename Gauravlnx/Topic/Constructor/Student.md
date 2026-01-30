class Student{  

int id;
String name;

Student(int i, String s){
    id = i;
    name = s;
}

void showDetails(){
    StudentInfoPrinter sp = new StudentInfoPrinter();
    sp.printDetails(id , name);
}

class StudentInfoPrinter{

void printDetails(int id , String name){

System.out.println("id : "+id);
System.out.println("Name : "+name);

}

}

public static void main(String[] args){

Student s1 = new Student(10,"gaurav");
s1.showDetails();




}

}