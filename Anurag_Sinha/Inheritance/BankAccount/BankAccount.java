package Inheritance.BankAccount;

class BankAccount {
    double initial=5000.00;
    void displayBalance(){
        System.out.println("Initial Balance: "+initial);
    }
}
class SA extends BankAccount{
    double deposit=2000.00;
    void deposit(){
        displayBalance();
        System.out.println("Deposited: "+deposit);
        System.out.println("New Balance: "+(deposit+initial));
    }
}

class Main{
    public static void main(String[] args){
        SA a=new SA();
        a.deposit();
    }
}