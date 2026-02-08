package Overriding;

class Employee {
int getBonus(){
return 1000;
}
}

class Manager extends Employee{
int getBonus(){
return 3000;
}
}

class Developer extends Employee{
int getBonus(){
return 2000;
}
}

class Main1{

    public static void main(String[] args){
        Employee e = new Employee();
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        int res1 = e.getBonus();
        System.out.println("Employee Bonus: "+res1);

        int res2 = e1.getBonus();
        System.out.println("Manager Bonus: "+res2);

        int res3 = e2.getBonus();
        System.out.println("Developer Bonus: "+res3);
    }


}