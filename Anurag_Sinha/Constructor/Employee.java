package Constructor;
import java.util.*;

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

        this.id=id;
        this.name=name;
        this.department="General";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your department (press enter to skip): ");
        String dept = sc.nextLine();

        Employee e;

        if (dept=="") {
            e = new Employee(id, name);
        } else {
            e = new Employee(id, name, dept);
        }

        e.display();
    }
}
