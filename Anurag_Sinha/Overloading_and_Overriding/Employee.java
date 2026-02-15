package Overloading_and_Overriding;

class Employee {
    int getbonus(){
        return 1000;
    }

    int Manager(){
        return 3000;
    }

    int Developer(){
        return 2000;
    }

    public static void main(String[] args){
        Employee e=new Employee();

        System.out.println("Employee Bonus: "+e.getbonus());
        System.out.println("Manager Bonus: "+e.Manager());
        System.out.println("Developer Bonus: "+e.Developer());
    }
}
