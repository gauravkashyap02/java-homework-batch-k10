class Employee {
int id;
String name;
String department;

   
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

 
    Employee(int id, String name) {
        this(id, name, "General"); 
    }

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Faiz", "IT");

        Employee e2 = new Employee(102, "Aman");

        e1.showDetails();
        e2.showDetails();
    }
}
