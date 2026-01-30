class Employee{

int id;
String name;
String department;


Employee(int i, String n , String d){

    id = i;
    name = n;
    department = d;

}

Employee(int i, String n){

    id = i;
    name = n;
    department = "general";

}

void showDetails(){
    System.out.println("Employee id : "+id);
    System.out.println("Name : "+name);
    System.out.println("Department: "+department);
}

public static void main(String[] args){
    
    Employee e = new Employee(10,"Gaurav kumar");
    
    e.showDetails();

}

}