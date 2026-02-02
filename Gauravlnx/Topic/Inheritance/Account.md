class Account{
    double balance;
    
    Account(double b){
        balance = b;
    }

    void showBalance(){
        System.out.println("Balance: " +balance);
    }

}

class SavingsAccount extends Account{

        double interestRate;

        SavingsAccount(double balance , double interestRate){
                super(balance);
                interestRate = interestRate;
        }

        @Override
        void showBalance(){
            double updateBalance = balance + (balance * interestRate / 100);
            System.out.println("Balance with interest: " +updateBalance);
        }
}

public class Main{

public static void main(String args[]){
    SavingsAccount sa = new SavingsAccount(1200, 3);

    sa.showBalance();


}



}