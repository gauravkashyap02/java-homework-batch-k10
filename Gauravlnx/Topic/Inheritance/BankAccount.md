class BankAccount{

    int iniBalance = 5000;

    void displayBalance(){
    System.out.println("Initial Balance: "+iniBalance);
    }

}
class SavingAccount extends BankAccount{
        
    void deposit(int balance){
        System.out.println("Deposit: "+balance);
        balance =  iniBalance + balance;
        System.out.println("New Balance: "+balance);
    }

    public static void main(String[] args){
        
    SavingAccount sa = new SavingAccount();
    sa.displayBalance();
    sa.deposit(2000);

    }
    

}